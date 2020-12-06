package Animals;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Gosho", "ribka");
        Animal dog = new Dog("Pesho", "parjoli");
        
        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());
    }
}
