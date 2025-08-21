package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(4.4, 8.2, 5.0);
        Box box4 = new Box(box2);

        BoxWeight box5 = new BoxWeight();

        System.out.println(box1.l + ", " + box1.w + ", " + box1.h);
        System.out.println(box2.l + ", " + box2.w + ", " + box2.h);
        System.out.println(box3.l + ", " + box3.w + ", " + box3.h);
        System.out.println(box4.l + ", " + box4.w + ", " + box4.h);

        System.out.println(box5.weight);

        Box box6 = new BoxWeight(2, 4, 6, 32); // a reference variable in stack memory that is pointing to the object
        // of BoxWeight in the heap memory
        // the reference variable determines what all properties of a class can be accessed
        // e.g. - if the reference variable is pointing to the object of parent class, the object can access all the
        // public properties of the parent class
        // if the reference variable is created from a child class and is pointing to an object of child class, then
        // its object can access all the properties of child class
        // if the reference variable created from a parent class and is pointing to the object of the child class,
        // then the object can access all the parent class properties
//        Even though box6 is declared as a Box, the actual object in memory is BoxWeight --> this is known as upcasting
        System.out.println(box6.l);
//        System.out.println(box6.weight);
//        cannot access the properties of BoxWeight directly

//        BoxWeight box7 = new Box();
//        this throws an error because the reference variable of type child class cannot point to the object of
//        parent class
//        here the object is of type parent class, thus the properties of parent class should be initialised, but
//        since the reference variable is of type child class, thus the constructor of parent class cannot be called

    }
}