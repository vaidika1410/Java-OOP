package HierarchicalInheritance;

public class Triangle extends Shape {
    int base, height;
    double area;

    Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
        this.area =  (double) (base * height) / 2;
    }

    void area() {
        System.out.println("Color: " + this.color + "\nArea: " + this.area + " sq. units.");
    }
}
