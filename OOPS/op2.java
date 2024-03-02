class Student {
    String name;
    int age;

    public void priInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        // Default constructor with no parameters
    }

    // Copy constructor
    Student(Student S2) {
        this.name = S2.name;
        this.age = S2.age;
    }
}

public class op2 {
    public static void main(String args[]) {
        Student S1 = new Student();
        S1.name = "Abba";
        S1.age = 24;

        Student S2 = new Student(S1);
    }
}
