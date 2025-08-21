package HierarchicalInheritance;

public class Rectangle extends Shape {
    int length, breadth;
    double area;

    Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    void area() {
        System.out.println("Color: " + this.color + "\nArea: " + this.area + " sq. units.");
    }
}
