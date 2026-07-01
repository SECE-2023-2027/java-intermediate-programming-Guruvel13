import java.util.Scanner;

class Vehicle {
    public String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {
    @Override
    public String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {
    @Override
    public String startEngine() {
        return "Motorcycle engine revs";
    }
}

public class VehicleDispatchEngine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehicle vehicle;

        System.out.println("Select Vehicle Type");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                vehicle = new Car();
                break;

            case 2:
                vehicle = new Motorcycle();
                break;

            default:
                vehicle = new Vehicle();
                break;
        }

        System.out.println("\nEngine Status:");
        System.out.println(vehicle.startEngine());

        sc.close();
    }
}