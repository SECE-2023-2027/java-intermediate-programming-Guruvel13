import java.util.Scanner;

abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Appliance Brand: " + brand);
        System.out.println("Appliance is now powered on.");
    }

    abstract void makeWork();
}

class WashingMachine extends Appliance {

    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void makeWork() {
        System.out.println("Washing machine is washing clothes.");
    }
}

public class Appliance_Catalog {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Washing Machine Brand: ");
        String brand = sc.nextLine();

        // List of valid brands
        if (brand.equalsIgnoreCase("Whirlpool") ||
                brand.equalsIgnoreCase("LG") ||
                brand.equalsIgnoreCase("Samsung") ||
                brand.equalsIgnoreCase("Bosch") ||
                brand.equalsIgnoreCase("IFB") ||
                brand.equalsIgnoreCase("Haier")) {

            Appliance app = new WashingMachine(brand);
            app.turnOn();
            app.makeWork();

        } else {
            System.out.println("Invalid Brand!");
            System.out.println("Available Brands:");
            System.out.println("Whirlpool");
            System.out.println("LG");
            System.out.println("Samsung");
            System.out.println("Bosch");
            System.out.println("IFB");
            System.out.println("Haier");
        }

        sc.close();
    }
}