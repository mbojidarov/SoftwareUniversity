package FirstAndReserveTeam;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    private void validateNamesLength(String name, String messagePrefix){
        if (name.length() < 3){
            throw new IllegalArgumentException
                    (messagePrefix + " cannot be less than 3 symbols");
        }
    }

    public void setFirstName(String firstName) {
        validateNamesLength(firstName, "First name");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        validateNamesLength(lastName, "Last name");
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    private void setSalary(double salary) {
        if (salary < 460.0){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            bonus = bonus / 2;
        }
        this.salary = this.getSalary() * (1 + bonus / 100);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {

        DecimalFormat decimal = new DecimalFormat("0.0######");

        return String.format("%s %s gets %s leva",
                this.firstName, this.lastName, decimal.format(this.salary));
    }
}
