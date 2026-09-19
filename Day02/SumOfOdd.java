//! Write a java program to calculate the sum of first n Odd numbers
import java.util.*;
public class SumOfOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=(n*2)-1;i=i+2){
            sum=sum+i;
        }
       System.out.println("The sum of first "+n+" Odd numbers is "+sum);
    }

}

//6
//1 3 5 7 9 11
// n*2-1 
