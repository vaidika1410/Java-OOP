package MultilevelInheritance;

public class Car extends Vehicle {
    String model;

    Car() {
        this.model = "Model 2";
    }

    Car(String brand, String model) {
        super(brand);
        this.model = model;
        displayBrand();
    }

    void displayModel() {
        System.out.println("Model: " + this.model);
    }
}
