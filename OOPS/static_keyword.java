public class static_keyword {

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 14);
        Student s2 = new Student("Mohit", 18);
        Student s3 = new Student("Raman", 19);
        s1.attendence();
        s1.attendence();
        Student.clg = "MAIT";

        s1.print();

        s2.attendence();
        s2.attendence();
        Student.classAttendence();

        s2.print();
        Student.clg = "GJU";

        s3.attendence();
        s3.attendence();

        s3.print();
    }
}

class Student {
    String name;
    int age;
    int attendence;
    static String clg;
    static int classAttendence;

    // normal methord
    void attendence() {
        attendence++;
    }

    // static methord
    static void classAttendence() {
        classAttendence++;
    }

    // constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("college: " + clg);
        System.out.println("attendence: " + attendence);
        System.out.println("classattendence: " + classAttendence + "\n");
    }
}
