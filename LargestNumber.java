import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest Number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number: " + b);
        } else {
            System.out.println("Largest Number: " + c);
        }
    }
}