package classroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int capacity;
    private List<Student> data;

    public Classroom(int capacity){
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }
    public List<Student> getStudents(){
        return this.data;
    }
    public int StudentsCount(){
        return this.data.size();
    }

    public String registerStudent(Student student) {
        if (this.data.size() < this.capacity){
            this.data.add(student);
            return String.format("Added student %s %s",
                   student.getFirstName(), student.getLastName());
        }else if (this.data.contains(student)) {
            return String.format("Student is already in the classroom");
        }
        return "No seats in the classroom"; // no capacity
    }

    public String dismissStudent(Student student) {
            if (this.data.contains(student)){
                this.data.remove(student);
                return String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
            }
        return "Student not found";
    }

//    public String getSubjectInfo(String subject) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(subject);
//        for (Student student : data) {
//            sb.append(String.format("%s %s", student.getFirstName(), student.getLastName()));
//        }
//        return sb.toString().trim();
//    }
}
