//! Write a java Program to find HCF of given two numbers
import java.util.*;
public class HCF{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number 1: ");
    int a=sc.nextInt();
    System.out.println("Enter number 2: ");
    int b=sc.nextInt();
    int hcf=0;
    for(int i=1;i<=a;i++){
        if(a%i==0 && b%i==0){
           hcf=i;
        }
    }
   System.out.println(hcf);
 }
}