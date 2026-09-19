//! Write a java Program to print all the factors for a given number

import java.util.*;
public class Factor {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
            sc.close();
        }
    
}
