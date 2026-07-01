import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Employee_Payroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee Details
        System.out.println("Enter Employee Details");
        System.out.print("Employee Name: ");
        String empName = sc.nextLine();
        // Employee Name: Bob
        System.out.print("Employee Base Salary: ");
        double empSalary = sc.nextDouble();
        sc.nextLine();
        // Employee Base Salary: 3000
        Employee emp = new Employee(empName, empSalary);

        // Manager Details
        System.out.println("\nEnter Manager Details");
        System.out.print("Manager Name: ");
        String mgrName = sc.nextLine();
        // Manager Name: Charlie
        System.out.print("Manager Base Salary: ");
        double mgrSalary = sc.nextDouble();
        // Manager Base Salary: 5000
        System.out.print("Manager Bonus: ");
        double bonus = sc.nextDouble();

        Manager mgr = new Manager(mgrName, mgrSalary, bonus);

        // Display Salaries
        System.out.println("\nEmployee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + mgr.calculateSalary());

        sc.close();
    }
}