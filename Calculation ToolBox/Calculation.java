import java.util.Scanner;

class AreaCalculator {

    // Circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Square
    public static double calculateArea(int side) {
        return side * side;
    }
}

public class Calculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Area Calculator");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle: " +
                        AreaCalculator.calculateArea(radius));
                break;

            case 2:
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();

                System.out.print("Enter Width: ");
                double width = sc.nextDouble();

                System.out.println("Area of Rectangle: " +
                        AreaCalculator.calculateArea(length, width));
                break;

            case 3:
                System.out.print("Enter Side: ");
                int side = sc.nextInt();

                System.out.println("Area of Square: " +
                        AreaCalculator.calculateArea(side));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}