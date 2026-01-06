package Session8;
import java.util.Scanner;

public class Calculator1 {
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
    public void add(){
        System.out.println("\n addition");
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("enter value of b");
        b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition is " + c);
    }
    public void sub(){
        System.out.println("\n Substraction");
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("enter value of b");
        b = sc.nextInt();
        int c = a-b;
        System.out.println("Sub  is " + c);

    }
    public void Div(){
        System.out.println("\n Division");
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("enter value of b");
        b = sc.nextInt();
        int c = a / b;
        System.out.println("Div is " + c);
    }
    public void mul(){
        System.out.println("\n multiplication");
        System.out.println("enter value of a");
        a = sc.nextInt();
        System.out.println("enter value of b");
        b = sc.nextInt();
        int c = a * b;
        System.out.println("Mul is " + c);
    }
    public static void main(String[] args) {
        Calculator1 d=new Calculator1();
        d.add();
        d.sub();
        d.mul();
        d.Div();
        }
    }

