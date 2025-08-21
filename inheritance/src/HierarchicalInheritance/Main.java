package HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 4);
        Rectangle rectangle = new Rectangle("Blue", 4, 2);
        Triangle triangle = new Triangle("Green", 6, 3);

        circle.area();
        System.out.println();
        rectangle.area();
        System.out.println();
        triangle.area();
    }
}
