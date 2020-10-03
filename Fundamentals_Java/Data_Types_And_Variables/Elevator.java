import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNum = Integer.parseInt(scanner.nextLine());
        int elevatorCapacity = Integer.parseInt(scanner.nextLine());

        int fullCourses = peopleNum / elevatorCapacity;
        if (peopleNum % elevatorCapacity != 0) {
            fullCourses++;
        }
        System.out.println(fullCourses);

        //SECOND VERSION
//        int count = peopleNum / elevatorCapacity;
//        if (count * elevatorCapacity < peopleNum){
//            count++;
//        }
//        System.out.println(count);

    }
}
