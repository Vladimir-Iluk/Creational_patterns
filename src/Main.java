import fabric_method.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("Select patterns");
                System.out.println("1. Factory");
                System.out.println("0. Exit");
                String command = scanner.nextLine();
                switch (command) {
                    case "Factory":
                        System.out.println("Print Hello or Bye");
                        String input = scanner.nextLine();
                        Dialog dialog;
                        if ("Hello".equalsIgnoreCase(input)) {
                            dialog = new HelloDialog();
                        } else if ("Bye".equalsIgnoreCase(input)) {
                            dialog = new ByeDialog();
                        } else {
                            System.out.println("Unknown type");
                            continue;
                        }
                        dialog.render();
                        break;
                    case "Exit":
                        running = false;
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }
    }
}
