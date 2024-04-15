import java.util.Scanner;

class Student {
    int enroll;
    String name;

    void display() {
        System.out.println("Enrollment Number:" + enroll);
        System.out.println("Name:" + name);
    }
}

public class pratical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("Enter details of students(Enrollment_no,Name)");
        s1.enroll = sc.nextInt();
        s1.name = sc.next();
        s2.enroll = sc.nextInt();
        s2.name = sc.next();
        s3.enroll = sc.nextInt();
        s3.name = sc.next();
        System.out.println("Displaying details of Students:");
        s1.display();
        s2.display();
        s3.display();
    }
}
