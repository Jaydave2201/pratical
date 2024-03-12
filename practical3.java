import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        int temp = 0;
        int n = 0;

        while (a > 0) {
            n = a % 10;
            temp = temp * 10 + n;
            a = a / 10;
            n = temp;
        }
        System.out.println(n);
    }

}
