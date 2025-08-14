class Main {
    public static void main(String[] args) {
        final A tudo = new A("tudo");
        System.out.println(tudo.name);

        tudo.name = "Videl"; // the instance variables can be modified.
//        tudo = new A("judo"); // this cannot be done since a final non-primitive cannot be reassigned.
    }
}

class A {
    final int num = 10; // the value of num cannot be changed
    String name;

    A(String name) {
        this.name = name;
    }
}