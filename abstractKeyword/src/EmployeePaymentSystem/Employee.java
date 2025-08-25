package EmployeePaymentSystem;

public abstract class Employee {
    String name;
    int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name of Employee: " + name + " | Employee Id: " + id);
    }
}
