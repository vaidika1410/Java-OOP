package DemoPackage1;

public class Subclass extends A {
    int age;

    Subclass(int num, String name) {
        super(num, name);
        this.age = 21;
    }

    public static void main(String[] args) {
        Subclass sb = new Subclass(20, "Tudo");

        System.out.println(sb.greet); // accessing a public member of same package
        System.out.println(sb.marks); // accessing a protected member of superclass of same package
    }
}
