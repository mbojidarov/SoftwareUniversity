package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;     //bought products

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (!NameValidator.isValidName(name)) {
            throw new IllegalArgumentException(ConstantMessages.INVALID_NAME_EX);
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (!NumericValidator.isNonNegative(money)) {
            throw new IllegalArgumentException(ConstantMessages.NEGATIVE_MONEY_EX);
        }
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s",
                    this.getName(), product.getName()));
        }
        products.add(product);
        this.money -= product.getCost();
    }

    @Override
    public String toString() {

        String output = this.products.isEmpty()
                ? "Nothing bought"
                : this.products.stream()
                .map(prod -> prod.getName())
                .collect(Collectors.joining(", "));

        return name + " - " + output;
    }
}
