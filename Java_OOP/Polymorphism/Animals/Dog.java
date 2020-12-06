package Animals;

public class Dog extends Animal {
    public Dog(String name, String food) {
        super(name, food);
    }


    @Override
    public String explainSelf() {
        return super.explainSelf() + System.lineSeparator()
                + "DJAAF";
    }
}
