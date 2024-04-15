import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cars {
    private String make;
    private String model;
    private boolean available;

    public Cars(String make, String model) {
        this.make = make;
        this.model = model;
        this.available = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class CarRentalSystem {
    private List<Cars> cars;

    public CarRentalSystem() {
        cars = new ArrayList<>();
    }

    public void addCar(String make, String model) {
        cars.add(new Cars(make, model));
    }

    public void rentCar(String make, String model) {
        for (Cars car : cars) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)) {
                if (car.isAvailable()) {
                    car.setAvailable(false);
                    System.out.println("You have rented the car: " + make + " " + model);
                    return;
                } else {
                    System.out.println("Sorry, the requested car is not available for rent.");
                    return;
                }
            }
        }
        System.out.println("Sorry, the requested car is not available.");
    }

    public void returnCar(String make, String model) {
        for (Cars car : cars) {
            if (car.getMake().equalsIgnoreCase(make) && car.getModel().equalsIgnoreCase(model)) {
                car.setAvailable(true);
                System.out.println("Thank you for returning the car: " + make + " " + model);
                return;
            }
        }
        System.out.println("Sorry, the requested car was not found.");
    }

    public void displayAvailableCars() {
        System.out.println("Available cars:");
        for (Cars car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getMake() + " " + car.getModel());
            }
        }
    }
}

public class car {
    public static void main(String[] args) {
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        carRentalSystem.addCar("Toyota", "Camry");
        carRentalSystem.addCar("Honda", "Civic");
        carRentalSystem.addCar("Ford", "Focus");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. Display available cars");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the make of the car you want to rent: ");
                    String rentMake = scanner.nextLine();
                    System.out.print("Enter the model of the car you want to rent: ");
                    String rentModel = scanner.nextLine();
                    carRentalSystem.rentCar(rentMake, rentModel);
                    break;
                case 2:
                    System.out.print("Enter the make of the car you are returning: ");
                    String returnMake = scanner.nextLine();
                    System.out.print("Enter the model of the car you are returning: ");
                    String returnModel = scanner.nextLine();
                    carRentalSystem.returnCar(returnMake, returnModel);
                    break;
                case 3:
                    carRentalSystem.displayAvailableCars();
                    break;
                case 4:
                    System.out.println("Thank you for using the car rental system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}