public class practical12 {
    static class student {
        int id;
        String name;
        int age;
        String dep;

        student(int i, String n, String d) {
            id = i;
            name = n;
            dep = d;

        }

        student(int i, String n, String d, int a) {
            id = i;
            name = n;
            dep = d;
            age = a;
        }

        void Display() {
            System.out.println("Student ID:- " + id + " \nStudent Name:- " + name + "\nStudent Department:-" + dep
                    + " \nStudent age:- " + age);
        }
    }

    public static void main(String[] args) {
        student s = new student(1, "jay Dave", "Computer");
        student s1 = new student(2, "Pushti Bhatt", "Doctor", 19);
        s.Display();
        s1.Display();
    }
}
