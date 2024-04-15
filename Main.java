import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;
    private boolean available;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.available = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}

class CarRentalSystem {
    private List<Car> inventory;

    public CarRentalSystem() {
        inventory = new ArrayList<>();
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public void rentCar(int index) {
        if (index >= 0 && index < inventory.size()) {
            Car car = inventory.get(index);
            if (car.isAvailable()) {
                car.setAvailable(false);
                System.out.println("You have rented: " + car);
            } else {
                System.out.println("Car is not available for rent.");
            }
        } else {
            System.out.println("Invalid car index.");
        }
    }

    public void returnCar(int index) {
        if (index >= 0 && index < inventory.size()) {
            Car car = inventory.get(index);
            car.setAvailable(true);
            System.out.println("You have returned: " + car);
        } else {
            System.out.println("Invalid car index.");
        }
    }

    public void displayAvailableCars() {
        System.out.println("Available cars for rent:");
        for (int i = 0; i < inventory.size(); i++) {
            Car car = inventory.get(i);
            if (car.isAvailable()) {
                System.out.println(i + ": " + car);
            }
        }
    }

    // Haversine formula to calculate distance between two points given their
    // latitude and longitude
    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Radius of the Earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                        * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }
}

public class Main {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();
        rentalSystem.addCar(new Car("Toyota", "Camry", 2020));
        rentalSystem.addCar(new Car("Honda", "Accord", 2019));
        rentalSystem.addCar(new Car("Ford", "Fusion", 2018));

        // Example usage of calculateDistance method
        double distance = CarRentalSystem.calculateDistance(40.7128, -74.0060, 34.0522, -118.2437);
        System.out.println("Distance between New York City and Los Angeles: " + distance + " km");

    }
}
