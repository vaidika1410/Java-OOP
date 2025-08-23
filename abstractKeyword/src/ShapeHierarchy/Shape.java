package ShapeHierarchy;

public abstract class Shape {
    abstract double area();
    abstract double perimeter();

    void describe() { // concrete / non-abstract method
        System.out.println("This is a shape");
    }
}
