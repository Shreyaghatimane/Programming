//! Write a java program to calculate the sum of 1st n even numbers starting from 2
import java.util.*;
public class FirstNEvenNumbersSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<=n*2;i=i+2){
                sum=sum+i;
        }
       System.out.println("The Sum of First "+n+" Even Natural numbers is "+sum);
    }
}

// 5
// 2 4 6 8 10 