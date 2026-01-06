package Session8;
import java.util.Scanner;



public class AgeWithScanner {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        System.out.println("enter your age");
        int age=u.nextInt();
        if(age>=18){
            System.out.println("you are eligible");
        }
        else {
            System.out.println("You are not eligible");
        }

    }
}
