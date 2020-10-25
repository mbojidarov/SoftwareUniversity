package BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<BankAccount> accountsList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] parts = input.split("\\s");
            int id = 0;
            if (parts.length > 1 && !parts[0].equals("SetInterest")) {
                id = Integer.parseInt(parts[1]);
                if (id > accountsList.size()) {
                    System.out.println("Account does not exist");
                    continue;
                }
            }
            BankAccount account = new BankAccount();
            switch (parts[0]) {
                case "Create":
                    printInfo(String.format("Account ID%d created", account.getId()));
                    accountsList.add(account);
                    break;
                case "Deposit":
                    account = accountsList.get(id - 1);
                    double balance = Double.parseDouble(parts[2]);
                  account.deposit(balance);
                    accountsList.set(id - 1, account);
                    printInfo( "Deposited " + parts[2] + " to ID" + parts[1]);
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(parts[1]);
                    account.setInterestRate(interestRate);
                    break;
                case "GetInterest":
                    account = accountsList.get(id - 1);
                    int year = Integer.parseInt(parts[2]);
                    printInfo(String.format("%.2f",account.getInterestRate(year)));
                    break;
            }

        }
    }

    private static void printInfo(String pattern) {
        System.out.println(pattern);
    }
}
