package UniversityManagementSystem;

public class Person {
    private String name;
    protected int age;
    public String university;
    String department;

    Person() {
        this.name = "Student1";
        this.age = 18;
        this.university = "ABC University";
        this.department = "xyz department";
    }

    Person(String name, int age, String university, String department) {
        this.name = name;
        this.age = age;
        this.university = university;
        this.department = department;
    }

//    to access the private member of a class, its getter is made public
    public void getName() {
        System.out.println("Name: " + name);
    }

    public void setName(String newName) {
        name = newName;
    }

//    age is a protected member, to make it accessible throughout the package and subclasses of same and different
//    packages, its getter is made protected
    protected void getAge() {
        System.out.println("Age: " + age);
    }

//    the getter of details consists of private members as well, thus made public to make them accessible
    public void getDetails() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nUniversity: " + university + "\nDepartment: " + department);
    }
}
