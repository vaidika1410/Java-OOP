package UniversityManagementSystem;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Vaidika", 21, "MIT", "Astronomy");
        Student student1 = new Student();
        Student student2 = new Student("Gautam", 21, "Harvard", "Business Tech");
        Professor professor1 = new Professor();
        Professor professor2 = new Professor("Prof. Mahesh", 41, "Stanford", "Electronics Engineering");

        System.out.println();

//        access the default details
        person1.getDetails();

        System.out.println();

        person2.getDetails();

        System.out.println();
        student2.getDetails();

        System.out.println();
        professor1.getDetails();
        System.out.println();
        professor2.getDetails();
    }
}