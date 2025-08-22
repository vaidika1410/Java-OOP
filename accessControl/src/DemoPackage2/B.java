package DemoPackage2;

import DemoPackage1.A;

public class B extends A {
    B(int num, String name) {
        super(num , name);
    }

    public static void main(String[] args) {
        B b = new B(23, "Tudo");
        System.out.println(b.greet); // accessing a public variable of superclass of another package

//        System.out.println(b.name); default variables of another package cannot be accessed
        System.out.println(b.marks); // accessing the protected variable of superclass of another package
    }
}
