package OrderByAge;

public class OnePerson {
    //Georgi 123456 20
    private String name;
    private String id;
    protected int age;

    public OnePerson(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {  //защото ни трябват годините за сортирането
        return this.age;
    }

    @Override
    public String toString() {
        //Stefan with ID: 524244 is 10 years old.
        return String.format("%s with ID: %s is %d years old.",
                this.name, this.id, this.age);
    }
}
