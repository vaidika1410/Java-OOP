package UniversityManagementSystem;

public class Professor extends Person {
    Professor() {
        setName("Professor");
        age = 35;
        university = "ABC College";
        department = "CSE";
    }

    Professor(String name, int age, String university, String department) {
        setName(name);
        this.age = age;
        this.university = university;
        this.department = department;
    }
}
