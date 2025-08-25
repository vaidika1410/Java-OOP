package EmployeePaymentSystem;

public class Intern extends Employee {
    double stipend;

    Intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary() {
        return stipend;
    }
}
