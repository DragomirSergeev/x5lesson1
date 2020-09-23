package ru.x5.hw07;

import ru.x5.hw07.accounteStore.*;
import ru.x5.hw07.storage.DBStorage;
import ru.x5.hw07.storage.FileStorage;
import ru.x5.hw07.storage.Storage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountServiceType type;
        Scanner scanner = new Scanner(System.in);
        try {
            type = AccountServiceType.valueOf(args[0].toUpperCase());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter type of store. (file/db)");
            type = AccountServiceType.valueOf(scanner.nextLine().toUpperCase());
        }
        AccountService service = new CustomAccountService();
        Storage storage = null;
        switch (type) {
            case DB:
                storage = new DBStorage();
                break;
            case FILE:
                storage = new FileStorage();
                break;
            default:
                service = new CustomAccountService();
                break;
        }
        service.setStorage(storage);


        while (true) {
            String command = scanner.nextLine();
            int[] parmeters;
            try {
                parmeters = parseString(command);
            } catch (NumberFormatException e) {
                System.out.println("Entered not a numbers. Retry...");
                continue;
            }

            try {
                if (command.toLowerCase().equals("exit")) {
                    break;
                } else if (command.contains("balance")) {
                    service.balance(parmeters[0]);

                } else if (command.contains("withdraw")) {
                    service.withdraw(parmeters[0], parmeters[1]);
                } else if (command.contains("deposit")) {
                    service.deposit(parmeters[0], parmeters[1]);
                } else if (command.contains("transfer")) {
                    service.transfer(parmeters[0], parmeters[1], parmeters[2]);
                } else {
                    System.out.println("No such command.");
                }
            } catch (UnknownAccountException e) {
                System.out.println("No such account");
                e.printStackTrace();
            } catch (NotEnoughtMoneyException e) {
                System.out.println("Not enought money");
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong count of parameters for method.");
            }
        }
        scanner.close();

    }

    static int[] parseString(String s) {
        String[] paramStrings = s.split(" ");
        int[] params = new int[paramStrings.length - 1];
        for (int i = 1; i < paramStrings.length; i++) {
            params[i - 1] = Integer.parseInt(paramStrings[i]);
        }
        return params;
    }
}
