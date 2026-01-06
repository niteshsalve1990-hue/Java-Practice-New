package Lab011;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("enter value of b");
        b = sc.nextInt();
        System.out.println("enter value of c");
        c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Greatest " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Greatest " + b);
        } else {
            System.out.println("Greatest  " + c);

        }
    }
}
