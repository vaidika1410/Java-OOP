package ShapeHierarchy;

public class Circle extends Shape {

    int radius;

    Circle(int radius) {

        this.radius = radius;
        System.out.println("Area: " + (float)(this.area()) + " sq.units. | Perimeter: " + (float)(this.perimeter()) + " units.");
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
