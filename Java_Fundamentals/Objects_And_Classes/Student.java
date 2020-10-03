public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Student(String firstName, String lastName, int age, String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }
    public void setCity (String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
