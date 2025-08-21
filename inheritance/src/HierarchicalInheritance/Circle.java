package HierarchicalInheritance;

public class Circle extends Shape {
    int radius;
    double area;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        this.area = 3.14 * radius * radius;
    }

    void area() {
        System.out.println("Color: " + this.color + "\nArea: " + this.area + " sq. units.");
    }
}
