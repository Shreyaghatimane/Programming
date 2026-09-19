//! Write a java program to find a LCM of two numbers
import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number2: ");
        int num2=sc.nextInt();
        int hcf=0;
        for(int i=1;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }

        int lcm=(num1*num2)/hcf;
        System.out.println(lcm);
    }
}
