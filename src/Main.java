import Builder.Director;
import fabric_method.*;
import  abstract_factory.*;
import Builder.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("Select patterns");
                System.out.println("1. Factory");
                System.out.println("2. Abstract Factory");
                System.out.println("3. Builder");
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
                    case "Abstract Factory":
                        System.out.println("Choose OS (Mac/Win):");
                        String osType = scanner.nextLine();

                        IFactory factory;
                        if ("Mac".equalsIgnoreCase(osType)) {
                            factory = new MacFactory();
                        } else if ("Win".equalsIgnoreCase(osType)) {
                            factory = new WinFactory();
                        } else {
                            System.out.println("Unknown OS type");
                            continue;
                        }

                        IButton button = factory.createButton();
                        button.paint();
                        break;
                    case "Builder":
                        System.out.println("Choose car type (Sports/City):");
                        String carType = scanner.nextLine();
                        Director director = new Director();
                        CarBuilder builder = new CarBuilder();
                        CarManualBuilder manualBuilder = new CarManualBuilder();
                        if ("Sports".equalsIgnoreCase(carType)) {
                            director.constructSportsCar(builder);
                            director.constructSportsCar(manualBuilder);
                        } else if ("City".equalsIgnoreCase(carType)) {
                            director.constructCityCar(builder);
                            director.constructCityCar(manualBuilder);
                        } else {
                            System.out.println("Unknown car type");
                            break;
                        }
                        Car car = builder.getResult();
                        System.out.println("Car built:\n" + car.getCarType());
                        Manual carManual = manualBuilder.getResult();
                        System.out.println("\nCar manual built:\n" + carManual.print());
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
