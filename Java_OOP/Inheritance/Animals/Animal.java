package Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);

    }
    protected String produceSound(){
       return "";
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (Validator.isNotValidName(name)){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if (Validator.isNotValidAge(age)){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    private void setGender(String gender) {
        if (Validator.isNotValidName(gender)){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append(this.getName() + " ").append(this.getAge() + " ").append(this.getGender()).append(System.lineSeparator());
        sb.append(this.produceSound());
        return sb.toString();
    }
}
