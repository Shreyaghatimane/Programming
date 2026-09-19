//! Write a java program to calculate a factorial of a given number
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number=sc.nextInt();
        int product=1;
        for(int i=1;i<=number;i++){
           product=product*i;
        }

        System.out.println("The factorial of a given number is: "+product);
    }
}
