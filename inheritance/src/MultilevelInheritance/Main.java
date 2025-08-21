package MultilevelInheritance;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Tesla", "Model 4");

        System.out.println(car1.brand); // accessing the property of a parent class
        System.out.println(car1.model); // accessing the property of a child class

        System.out.println(car2.brand + ", " + car2.model);
        car2.displayModel();

        ElectricCar ec1 = new ElectricCar();
        System.out.println("Default battery capacity: " + ec1.batteryCapacity + "kWh");

        ElectricCar ec2 = new ElectricCar("Mahindra", "BE6", 59);
        ec2.displayBatteryCapacity();
        ec2.displayModel();
    }
}
