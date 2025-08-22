package StaticDemo;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        BoxWeight box2 = new BoxWeight();
        Box box3 = new BoxWeight();


//        box1.greetings();
        box2.greetings();
        Box.greetings(); // could directly access static methods since they do not require objects
        BoxWeight.greetings();
//        box3.greetings(); // overriding the method of parent class
    }
}
