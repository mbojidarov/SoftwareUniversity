package Students;

public class OneStudent {
    //Lakia Eason 3.90
    String firstName;
    String secondName;
    double grade;

    public OneStudent(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public double getGrade() {  //ще ни трябва в Мейн да вземем оценката
        return this.grade;      //за да можем по нея да сортираме
    }

    @Override
    public String toString() {
        //Rocco Erben: 6.00
        return String.format("%s %s: %.2f",
                this.firstName, this.secondName, this.grade);
    }
}
