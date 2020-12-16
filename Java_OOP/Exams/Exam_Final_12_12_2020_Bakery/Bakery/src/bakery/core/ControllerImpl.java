package bakery.core;

import bakery.common.ExceptionMessages;
import bakery.common.OutputMessages;
import bakery.core.interfaces.Controller;
import bakery.entities.bakedFoods.Bread;
import bakery.entities.bakedFoods.Cake;
import bakery.entities.bakedFoods.interfaces.BakedFood;
import bakery.entities.drinks.Tea;
import bakery.entities.drinks.Water;
import bakery.entities.drinks.interfaces.Drink;
import bakery.entities.tables.InsideTable;
import bakery.entities.tables.OutsideTable;
import bakery.entities.tables.interfaces.Table;
import bakery.repositories.interfaces.*;

import static bakery.common.ExceptionMessages.*;
import static bakery.common.OutputMessages.*;

public class ControllerImpl implements Controller {
    private FoodRepository<BakedFood> foodRepository;
    private DrinkRepository<Drink> drinkRepository;
    private TableRepository<Table> tableRepository;
    private double totalMoney;

    public ControllerImpl(FoodRepository<BakedFood> foodRepository, DrinkRepository<Drink> drinkRepository, TableRepository<Table> tableRepository) {
        this.foodRepository = foodRepository;
        this.drinkRepository = drinkRepository;
        this.tableRepository = tableRepository;
        this.totalMoney = 0.0;
    }

    @Override
    public String addFood(String type, String name, double price) {
        //TODO:
        if (this.foodRepository.getByName(name) != null){
            throw new IllegalArgumentException(String.format(FOOD_OR_DRINK_EXIST, type, name));
        }

        BakedFood food = null;

        if ("Bread".equals(type)){
            food = new Bread(name, price);

        }else if ("Cake".equals(type)){
            food = new Cake(name, price);
        }
        foodRepository.add(food);
        return String.format(FOOD_ADDED, name, type);
    }

    @Override
    public String addDrink(String type, String name, int portion, String brand) {
        //TODO:
        if (this.drinkRepository.getByNameAndBrand(name, brand) != null){
            throw new IllegalArgumentException(String.format(FOOD_OR_DRINK_EXIST, type, name));
        }

        Drink drink = null;

        if ("Tea".equals(type)){
            drink = new Tea(name, portion, brand);

        }else if ("Water".equals(type)){
            drink = new Water(name, portion, brand);
        }
        drinkRepository.add(drink);
        return String.format(DRINK_ADDED, name, brand);
    }

    @Override
    public String addTable(String type, int tableNumber, int capacity) {
        //TODO:
        if (this.tableRepository.getByNumber(tableNumber) != null){
            throw new IllegalArgumentException(String.format(TABLE_EXIST, tableNumber));
        }

        Table table = null;

        if ("InsideTable".equals(type)){
        table = new InsideTable(tableNumber, capacity);
        }else if ("OutsideTable".equals(type)){
            table = new OutsideTable(tableNumber, capacity);
        }
        tableRepository.add(table);
        return String.format(TABLE_ADDED, tableNumber);
    }

    @Override
    public String reserveTable(int numberOfPeople) {
        //TODO:
        Table freeTable = tableRepository.getAll().stream()
                .filter(table -> !table.isReserved())
                .filter(table -> table.getCapacity() >= numberOfPeople)
                .findFirst().orElse(null);

        if (freeTable == null){
            return String.format(RESERVATION_NOT_POSSIBLE, numberOfPeople);
        }
        freeTable.reserve(numberOfPeople);
        //todo
        return String.format(TABLE_RESERVED, freeTable.getTableNumber(), numberOfPeople);
    }

    @Override
    public String orderFood(int tableNumber, String foodName) {
        //TODO:
        Table orderTable = tableRepository.getAll().stream()
                .filter(table -> table.getTableNumber() == tableNumber)
                .findFirst().orElse(null);
        if (orderTable == null){
            return String.format(WRONG_TABLE_NUMBER, tableNumber);
        }

        BakedFood orderedFood = foodRepository.getByName(foodName);
        if (orderedFood == null){
            return String.format(NONE_EXISTENT_FOOD, foodName);
        }

        tableRepository.getByNumber(tableNumber).orderFood(orderedFood);
        return String.format(FOOD_ORDER_SUCCESSFUL, tableNumber, foodName);
    }

    @Override
    public String orderDrink(int tableNumber, String drinkName, String drinkBrand) {
        //TODO:
        Table drinkTable = tableRepository.getAll().stream()
                .filter(table -> table.getTableNumber() == tableNumber)
                .findFirst().orElse(null);
        if (drinkTable == null){
            return String.format(WRONG_TABLE_NUMBER, tableNumber);
        }

        Drink drink = drinkRepository.getByNameAndBrand(drinkName, drinkBrand);
        if (drink == null){
            return String.format(NON_EXISTENT_DRINK, drinkName, drinkBrand);
        }

        tableRepository.getByNumber(tableNumber).orderDrink(drink);
        return String.format(DRINK_ORDER_SUCCESSFUL, tableNumber, drinkName, drinkBrand);
    }

    @Override
    public String leaveTable(int tableNumber) {
        //TODO:
        Table leaveTable = tableRepository.getAll().stream().filter(table -> table.getTableNumber() == tableNumber)
                .findFirst().orElse(null);
        if (leaveTable == null){
            return String.format(WRONG_TABLE_NUMBER, tableNumber);
        }
        double checkPls = leaveTable.getBill();
        totalMoney += checkPls;
        leaveTable.clear();
        return String.format(BILL, tableNumber, checkPls).trim();
    }

    @Override
    public String getFreeTablesInfo() {
        //TODO:
        StringBuilder sb = new StringBuilder();
        tableRepository.getAll().stream()
                .filter(table -> !table.isReserved())
                .forEach(table -> sb.append(table.getFreeTableInfo())
                .append(System.lineSeparator()));

        return sb.toString().trim();
    }

    @Override
    public String getTotalIncome() {
        return String.format(TOTAL_INCOME, totalMoney);
    }
}
