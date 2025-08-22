package UniversityManagementSystem;

public class Student extends Person {
    Student() {
        super();
//        getName();
//        getAge();
        getDetails();
    }

    Student(String name, int age, String university, String department) {
        setName(name);
        this.age = age;
        this.university = university;
        this.department = department;
    }
}
