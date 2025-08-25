package EmployeePaymentSystem;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];

        employee[0] = new FullTimeEmployee("John", 101, 55000);
        employee[1] = new PartTimeEmployee("Alice", 102, 500, 40);
        employee[2] = new Intern("Bob", 103, 15000);

        for(Employee e: employee) {
            e.displayInfo();
            System.out.println("Salary: " + e.calculateSalary());
            System.out.println();
        }

    }
}
