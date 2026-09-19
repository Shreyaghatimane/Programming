//! Write a java program to print the comman factors of two numbers
import java.util.*;
public class CommanFactors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int a=sc.nextInt();
        System.out.print("Enter a Number 2 : ");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                System.out.print(i+" ");
            }
        }
      sc.close();
    }
}
