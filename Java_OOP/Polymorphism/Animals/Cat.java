package Animals;

public class Cat extends Animal{

    public Cat(String name, String food){
        super(name, food);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + System.lineSeparator()
                + "MEEOW";
    }
}
