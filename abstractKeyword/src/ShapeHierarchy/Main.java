package ShapeHierarchy;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        Shape newShape = new Rectangle(2, 4);

        System.out.println();
        Shape shapes[] = new Shape[2];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(2,  4);

        for(Shape s : shapes){
//            s.area();
//            s.perimeter();
            s.describe();
        }

//        rectangle.describe();
//        newShape.describe();
    }
}
