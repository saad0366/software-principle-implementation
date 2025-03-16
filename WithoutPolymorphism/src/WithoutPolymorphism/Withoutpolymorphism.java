import java.util.Scanner;

class FullTime {
    String name;
    double fixedSalary;

    FullTime(String name, double fixedSalary) {
        this.name = name;
        this.fixedSalary = fixedSalary;
    }

    void calculateSalary() {
        System.out.println(name + "'s Salary: $" + fixedSalary);
    }
}

class PartTime {
    String name;
    double hourlyRate;
    int hoursWorked;

    PartTime(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        System.out.println(name + "'s Salary: $" + (hourlyRate * hoursWorked));
    }
}

class Freelancer {
    String name;
    double projectRate;
    int projectsCompleted;

    Freelancer(String name, double projectRate, int projectsCompleted) {
        this.name = name;
        this.projectRate = projectRate;
        this.projectsCompleted = projectsCompleted;
    }

    void calculateSalary() {
        System.out.println(name + "'s Salary: $" + (projectRate * projectsCompleted));
    }
}

public class WithoutPolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Type (Full-Time/Part-Time/Freelancer): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("Full-Time")) {
            System.out.print("Enter fixed salary: ");
            double fixedSalary = scanner.nextDouble();
            FullTime emp = new FullTime(name, fixedSalary);
            emp.calculateSalary();
        } else if (type.equalsIgnoreCase("Part-Time")) {
            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.print("Enter hours worked: ");
            int hoursWorked = scanner.nextInt();
            PartTime emp = new PartTime(name, hourlyRate, hoursWorked);
            emp.calculateSalary();
        } else if (type.equalsIgnoreCase("Freelancer")) {
            System.out.print("Enter project rate: ");
            double projectRate = scanner.nextDouble();
            System.out.print("Enter projects completed: ");
            int projectsCompleted = scanner.nextInt();
            Freelancer emp = new Freelancer(name, projectRate, projectsCompleted);
            emp.calculateSalary();
        } else {
            System.out.println("Invalid Employee Type!");
        }
    }
}


