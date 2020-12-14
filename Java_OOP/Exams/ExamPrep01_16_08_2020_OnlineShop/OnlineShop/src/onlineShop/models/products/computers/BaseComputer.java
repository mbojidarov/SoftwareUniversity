package onlineShop.models.products.computers;

import onlineShop.models.products.BaseProduct;
import onlineShop.models.products.components.Component;
import onlineShop.models.products.peripherals.Peripheral;

import java.util.ArrayList;
import java.util.List;

import static onlineShop.common.constants.ExceptionMessages.EXISTING_COMPONENT;

public abstract class BaseComputer extends BaseProduct implements Computer{
    private List<Component> components;
    private List<Peripheral> peripherals;

    protected BaseComputer(int id, String manufacturer, String model,
                           double price, double overallPerformance) {
        super(id, manufacturer, model, price, overallPerformance);
        this.components = new ArrayList<>();
        this.peripherals = new ArrayList<>();
    }

    @Override
    public double getOverallPerformance() {
        double componentsPerformance =
                components.stream()
                        .mapToDouble(Component::getOverallPerformance)
                        .average().orElse(0);

        return super.getOverallPerformance() + componentsPerformance;
    }

    @Override
    public double getPrice() {

        return super.getPrice() +
                components.stream().mapToDouble(Component::getPrice).sum() +
                peripherals.stream().mapToDouble(Peripheral::getPrice).sum();
    }


    @Override
    public List<Component> getComponents() {
        return null;
    }

    @Override
    public List<Peripheral> getPeripherals() {
        return null;
    }

    @Override
    public void addComponent(Component component) {
        if (components.stream().anyMatch(c-> c.getClass() == component.getClass())){
            throw new IllegalArgumentException(
                    String.format(EXISTING_COMPONENT, component.getClass().getSimpleName(),
                            this.getClass().getSimpleName(), this.getId()));
        }
        this.components.add(component);
    }

    @Override
    public Component removeComponent(String componentType) {
        return null;
    }

    @Override
    public void addPeripheral(Peripheral peripheral) {

    }

    @Override
    public Peripheral removePeripheral(String peripheralType) {
        return null;
    }

    //"Overall Performance: {overall performance}. Price: {price} - {product type}: {manufacturer} {model} (Id: {id})"
    //" Components ({components count}):"
    //"  {component one}"
    //"  {component two}"
    //"  {component n}"
    //" Peripherals ({peripherals count}); Average Overall Performance ({average overall performance peripherals}):"
    //"  {peripheral one}"
    //"  {peripheral two}"
    //"  {peripheral n}"
    //
    // !!!!!! Note: Be careful, some of the rows have one or two whitespaces at the beginning of the sentences!
    @Override
    public String toString() {
        return "BaseComputer{" +
                "components=" + components +
                ", peripherals=" + peripherals +
                '}';
    }
}
