package HierarchicalInheritance;

public class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }

    void area() {
        System.out.println("Area of shape");
    }
}
