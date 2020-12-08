package WildFarm.animals;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder(super.toString());
        sb.insert(sb.indexOf(",") + 2, this.breed + ", ");

        return sb.toString();
    }
}
