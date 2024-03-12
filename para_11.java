import java.util.Scanner;

public class para_11 {
    public static void main(String[] args) {
        shape s = new shape();
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter Area of circle:- ");
        int a = inScanner.nextInt();
        System.out.println("Enter length of Rectangle:- ");
        int b = inScanner.nextInt();
        System.out.println("Enter Width of Rectangle :- ");
        int c = inScanner.nextInt();

        s.area(a);
        s.area(b, c);

        
    }
}

class shape {
    void area(float radius) {
        System.out.println("Area of Circle:-" + 3.14 * radius * radius);
    }

    void area(float length, float width) {
        System.out.println("Area of Rectangle :-" + length * width);
    }

}