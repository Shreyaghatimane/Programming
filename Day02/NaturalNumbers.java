//! Write a java program to Calculate the first n  Natural Numbers
import java.util.*;
public class NaturalNumbers{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
             sum=sum+i;
        }

        System.out.println("The of first "+n+" Natural numbers is "+sum);
    }

}