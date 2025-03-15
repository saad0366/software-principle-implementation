package withpolymorphism;

import java.util.Scanner;

// Base Class
abstract class Employee {
    String name;
    public Employee(String name) {
        this.name = name;
    }
    public abstract void calculateSalary();
}

// Full-Time Employee
class FullTime extends Employee {
    private double fixedSalary;

    public FullTime(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    public void calculateSalary() {
        System.out.println(name + "'s Total Salary: $" + fixedSalary);
    }
}

// Part-Time Employee
class PartTime extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        System.out.println(name + "'s Total Salary: $" + (hourlyRate * hoursWorked));
    }
}

// Freelancer Employee
class Freelancer extends Employee {
    private double projectRate;
    private int projectsCompleted;

    public Freelancer(String name, double projectRate, int projectsCompleted) {
        super(name);
        this.projectRate = projectRate;
        this.projectsCompleted = projectsCompleted;
    }

    public void calculateSalary() {
        System.out.println(name + "'s Total Salary: $" + (projectRate * projectsCompleted));
    }
}

 class withpolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Type (Full-Time/Part-Time/Freelancer): ");
        String type = scanner.nextLine();

        Employee emp;

        switch (type.toLowerCase()) {
            case "full-time":
                System.out.print("Enter fixed salary: ");
                double fixedSalary = scanner.nextDouble();
                emp = new FullTime(name, fixedSalary);
                break;

            case "part-time":
                System.out.print("Enter per hour salary: ");
                double hourlyRate = scanner.nextDouble();
                System.out.print("Enter hours worked: ");
                int hoursWorked = scanner.nextInt();
                emp = new PartTime(name, hourlyRate, hoursWorked);
                break;

            case "freelancer":
                System.out.print("Enter per project salary: ");
                double projectRate = scanner.nextDouble();
                System.out.print("Enter number of projects completed: ");
                int projectsCompleted = scanner.nextInt();
                emp = new Freelancer(name, projectRate, projectsCompleted);
                break;

            default:
                System.out.println("Invalid Employee Type!");
                return;
        }

        emp.calculateSalary();
    }
}
