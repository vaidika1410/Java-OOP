package HierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Yellow");
        Circle circle = new Circle("Red", 4);
        Rectangle rectangle = new Rectangle("Blue", 4, 2);
        Triangle triangle = new Triangle("Green", 6, 3);
        Shape sh = new Rectangle("Purple", 3, 4); //method overriding -> runtime polymorphism
//        even when the reference type is of parent class and object is of child class, the method being called is
//        decided by the type of object. This is done at RUNTIME in Java, using DYNAMIC METHOD DISPATCH.

        shape.displayColor();
        System.out.println();
        circle.area();
        System.out.println();
        rectangle.area();
        System.out.println();
        triangle.area();
        System.out.println();
        sh.displayColor();
        System.out.println();
        sh.area(); // --> overrides the method of parent class. The parent reference variable decides what all
        // methods are visible to the child object.
        // In case of variables, the object only has access to the reference type variables, i.e. of the parent class.
    }
}
