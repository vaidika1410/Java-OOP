package MultilevelInheritance;

public class Vehicle {
    String brand;

    Vehicle() {
        this.brand = "Tesla";
    }

    Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayBrand() {
        System.out.println("brand : " + brand);
    }
}
