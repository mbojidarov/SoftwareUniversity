import java.util.*;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder tourSB = new StringBuilder();
        tourSB.append(input);

        while (!"Travel".equals(input)){
            String[] parts = input.split(":");
            String command = parts[0];
            switch (command){
                case "Add Stop":
                    int insertIndex = Integer.parseInt(parts[1]);
                    String stopDestination = parts[2];
                    int len = tourSB.length();
                    if (insertIndex > len && insertIndex < 0){
                        break;
                    }else{
                        tourSB.insert(insertIndex, stopDestination);
                        System.out.println(tourSB);
                    }

                    break;
                case "Remove Stop":
                    int remStartIndex = Integer.parseInt(parts[1]);
                    int remEndIndex = Integer.parseInt(parts[2]);
                    if (remEndIndex > tourSB.length() && remStartIndex < 0){
                        break;
                    }else{
                        tourSB.delete(remStartIndex, remEndIndex + 1);
                        System.out.println(tourSB);
                    }

                    break;
                case "Switch":
                    String oldDest = parts[1];
                    String newDest = parts[2];
                    String text = tourSB.toString();
                    if (text.contains(oldDest)){
                        text = text.replace(oldDest, newDest);
                        tourSB.setLength(0);
                        tourSB.append(text);
                    }

                    System.out.println(tourSB);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",
                tourSB.toString());
    }
}