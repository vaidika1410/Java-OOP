package DemoPackage1;

public class A {
    private int num; // private num variable --> only accessed through class A's methods
    String name;
    int[] arr;
    public String greet = "Hello";
    protected float marks = 95;

    int getNum() {
        return num;
    }

    A() {
        this.name = "Vaidika";
        this.num = 54;
    }

    void setNum(int n) {
        num = n;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
