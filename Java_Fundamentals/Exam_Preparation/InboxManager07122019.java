import java.util.*;

public class InboxManager07122019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> mailsDB = new HashMap<>();

        while (!"Statistics".equals(input)){
            String[] parts = input.split("->");
            String command = parts[0];
            String username = parts[1];

            switch (command){
                case "Add":
                    if (mailsDB.containsKey(username)){
                        System.out.printf("%s is already registered%n", username);
                    }else{
                        mailsDB.putIfAbsent(username, new ArrayList<>());
                    }
                    break;
                case "Send":
                    String mailText = parts[2];

                    // РАЗБИТО с Лист
//                    List<String> currentEmail = mailsDB.get(username);
//                    currentEmail.add(mailText);
//                    mailsDB.put(username, currentEmail);

                    if (mailsDB.containsKey(username)){
                        mailsDB.get(username).add(mailText);
                    }
                    break;
                case "Delete":
                    if (mailsDB.containsKey(username)){
                        mailsDB.remove(username);
                    }else{
                        System.out.printf("%s not found!%n", username);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int userCount = mailsDB.size();
        System.out.printf("Users count: %d%n", userCount);

        mailsDB.entrySet().stream()
                .sorted((u1, u2) -> {
                    int result = Integer.compare(u2.getValue().size(), u1.getValue().size());
                    if (result == 0){
                        result = u1.getKey().compareTo(u2.getKey());
                    }
                    return result;
                })
                .forEach(user -> {
                    System.out.printf("%s%n", user.getKey());
                    user.getValue().stream()
                            .forEach(userMail -> System.out.printf(" - %s%n", userMail));
                });
    }
}
