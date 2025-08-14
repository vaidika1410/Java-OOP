public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(11, "Student2", 78f);
        Student student3 = new Student(12, "Student3", 90f);

        System.out.println(student1.name + " - " + student1.marks);

        System.out.println(student2.name + " - " + student2.marks);

        System.out.println(student3.name + " - " + student3.marks);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student() {
        // calling a constructor from a constructor
        // internally: new Student (10, "Student1", 100f)
        this(10, "Student1", 100f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student student3) {
        this.rno = student3.rno;
        this.name = student3.name;
        this.marks = student3.marks;
    }
}