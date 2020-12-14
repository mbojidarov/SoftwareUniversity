package onlineShop.core;

import onlineShop.core.interfaces.Controller;
import onlineShop.models.products.components.*;
import onlineShop.models.products.computers.Computer;
import onlineShop.models.products.computers.DesktopComputer;
import onlineShop.models.products.computers.Laptop;

import java.util.HashMap;
import java.util.Map;

import static onlineShop.common.constants.ExceptionMessages.*;
import static onlineShop.common.constants.OutputMessages.ADDED_COMPONENT;
import static onlineShop.common.constants.OutputMessages.ADDED_COMPUTER;

public class ControllerImpl implements Controller {
    private Map<Integer, Computer> computers;
    private Map<Integer, Component> components;

    public ControllerImpl() {
        this.computers = new HashMap<>();
        this.components = new HashMap<>();
    }

    @Override
    public String addComputer(String computerType, int id, String manufacturer, String model, double price) {
        if (computers.containsKey(id)) {
            throw new IllegalArgumentException(EXISTING_COMPUTER_ID);
        }

        Computer computer;
        if (computerType.equals("DesktopComputer")) {
            computer = new DesktopComputer(id, manufacturer, model, price);
        } else if (computerType.equals("Laptop")) {
            computer = new Laptop(id, manufacturer, model, price);
        } else {
            throw new IllegalArgumentException(INVALID_COMPUTER_TYPE);
        }
        computers.put(id, computer);

        return String.format(ADDED_COMPUTER, id);
    }

    @Override
    public String addPeripheral(int computerId, int id, String peripheralType, String manufacturer, String model, double price, double overallPerformance, String connectionType) {

        return null;
    }

    @Override
    public String removePeripheral(String peripheralType, int computerId) {
        return null;
    }

    @Override
    public String addComponent(int computerId, int id, String componentType, String manufacturer, String model, double price, double overallPerformance, int generation) {

        checkComputerID(computerId);

        if (components.containsKey(id)) {
            throw new IllegalArgumentException(EXISTING_COMPONENT_ID);
        }

        Component component;
        switch (componentType){
            case "CentralProcessingUnit":
                component = new CentralProcessingUnit(id, manufacturer, model,
                        price, overallPerformance * 1.25, generation);
                 break;
            case "Motherboard":
                component = new Motherboard(id, manufacturer, model,
                        price, overallPerformance * 1.25, generation);
                break;
            case "PowerSupply":
                component = new PowerSupply(id, manufacturer, model,
                        price, overallPerformance * 1.05, generation);
                break;
            case "RandomAccessMemory":
                component = new RandomAccessMemory(id, manufacturer, model,
                        price, overallPerformance * 1.20, generation);
                break;
            case "SolidStateDrive":
                component = new SolidStateDrive(id, manufacturer, model,
                        price, overallPerformance * 1.20, generation);
                break;
            case "VideoCard":
                component = new VideoCard(id, manufacturer, model,
                        price, overallPerformance * 1.15, generation);
                break;
            default:
                throw new IllegalArgumentException(INVALID_COMPONENT_TYPE);

        }
        components.put(component.getId(), component);

        computers.get(computerId).addComponent(component);

        return String.format(ADDED_COMPONENT, componentType, id, computerId);
    }


    @Override
    public String removeComponent(String componentType, int computerId) {
        return null;
    }

    @Override
    public String buyComputer(int id) {
        return null;
    }

    @Override
    public String BuyBestComputer(double budget) {
        return null;
    }

    @Override
    public String getComputerData(int id) {
        return null;
    }

    private void checkComputerID(int id) {
        if (!this.computers.containsKey(id)) {
            throw new IllegalArgumentException(NOT_EXISTING_COMPUTER_ID);
//   !!!  NOTE: For each command, except for "addComputer" and "buyBest",
//            you must check if a computer, with that id, exists in the computers collection. If it doesn't, throw an IllegalArgumentException with the message "Computer with this id does not exist.".
        }
    }
}
