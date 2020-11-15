package ShoppingSpree;

public class Product {
    private String name;
    private double cost;

public Product(String name, double cost){
    this.setName(name);
    this.setCost(cost);
}

    private void setName(String name) {
        if (!NameValidator.isValidName(name)){
            throw new IllegalArgumentException(ConstantMessages.INVALID_NAME_EX);
        }
        this.name = name;
    }

    private void setCost(double cost) {
        if (!NumericValidator.isNonNegative(cost)){
            throw new IllegalArgumentException(ConstantMessages.NEGATIVE_COST_EX);
        }
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
