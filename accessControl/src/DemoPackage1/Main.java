package DemoPackage1;

public class Main {
    public static void main(String[] args) {
        A a = new A(4, "Person A");
        Subclass sb1 = new Subclass(34, "Gautam");

        int n = a.getNum(); // num is private and is only accessed through the methods of class A
        System.out.println(n);

        System.out.println(a.name); // name can be directly accessed since it is default and is accessed throughout
        // the same package


    }
}
