<<<<<<< HEAD
import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        System.out.println("First " + n + " prime numbers are:");
        while (count < n) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
=======
import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        System.out.println("First " + n + " prime numbers are:");
        while (count < n) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
>>>>>>> 26946056db18e1084bd1ce89407f20aaba8462ce
