public class Main {
    public static void main(String[] args) {

        Student tudo = new Student();
        Student judo = new Student();

        tudo.rno = 54;
        tudo.name = "tudo";
        tudo.marks = 87.6f;

        judo.changeName("gohan");
        judo.changeName("todoroki");
        judo.greeting();

        System.out.println(tudo.rno);
        System.out.println(tudo.name);
        System.out.println(tudo.marks);

        Student videl = new Student(64, "Videl", 91f);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("hello, my name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student() {
        this.rno = 63;
        this.name = "judo";
        this.marks = 89;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;

        System.out.println(rno);
        System.out.println(name);
        System.out.println(marks);
    }

}