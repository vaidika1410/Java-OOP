package ShapeHierarchy;

public class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Area: " + (float)(this.area()) + " sq.units. | Perimeter: " + (float)(this.perimeter()) +
                " units.");
    }

    @Override
    void describe() {
        System.out.println("shape rectangle");
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}
