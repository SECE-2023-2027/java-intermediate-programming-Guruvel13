import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0)
            return 0.0;

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public String getName() {
        return name;
    }
}

public class Student_Gradebook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        // Enter Student Name: Alice
        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();
        // Enter Number of Subjects: 3
        int[] marks = new int[n];

        System.out.println("Enter Marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        // Subject 1: 80
        // Subject 2: 95
        // Subject 3: 85
        Student s = new Student(name, marks);

        System.out.println("\nStudent Name: " + s.getName());
        // Student Name: Alice
        System.out.printf("Average Marks: %.1f%n", s.calculateAverage());
        // Average Marks: 86.7

        sc.close();
    }
}