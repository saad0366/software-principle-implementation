package WithoutPolymorphism;

import java.util.Scanner;

class Employee {
    String name, type;
    double salary, hourlyRate, perProjectRate;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void calculateSalary() {
        Scanner scanner = new Scanner(System.in);

        if (type.equalsIgnoreCase("full-time")) {
            System.out.print("Enter fixed salary: ");
            salary = scanner.nextDouble();
            System.out.println(name + "'s Total Salary: $" + salary);
        } 
        else if (type.equalsIgnoreCase("part-time")) {
            System.out.print("Enter per hour salary: ");
            hourlyRate = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            int hours = scanner.nextInt();
            salary = hourlyRate * hours;
            System.out.println(name + "'s Total Salary: $" + salary);
        } 
        else if (type.equalsIgnoreCase("freelancer")) {
            System.out.print("Enter per project salary: ");
            perProjectRate = scanner.nextDouble();
            System.out.print("Enter number of projects completed: ");
            int projects = scanner.nextInt();
            salary = perProjectRate * projects;
            System.out.println(name + "'s Total Salary: $" + salary);
        } 
        else {
            System.out.println("Invalid Employee Type!");
        }
    }
}

public class Withoutpolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Type (Full-Time/Part-Time/Freelancer): ");
        String type = scanner.nextLine();

        Employee emp = new Employee(name, type);
        emp.calculateSalary();
    }
}

