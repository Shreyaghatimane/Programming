//!Write a java program to calculate the a^b 
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base number");
        int a =sc.nextInt();
        System.out.println("Enter a power");
        int b=sc.nextInt();
        int product=1;
        for(int i=1;i<=b;i++){
            product=product*a;
        }

        System.out.println(a+" to the power "+b+" is "+product);
    }
}
