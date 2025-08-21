package MultilevelInheritance;

public class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar() {
        this.batteryCapacity = 75;
    }

    ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    void displayBatteryCapacity() {
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nBattery Capacity: " + batteryCapacity);
    }
}
