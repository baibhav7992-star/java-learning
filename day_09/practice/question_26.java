package day_09.practice;
import java.util.Scanner;
/*
Question 5

Create a function that takes a number as parameter
and prints its factorial.
*/
public class question_26 {
    static void display(int number) {
        int fact = 1;
        System.out.println("your number is :" +number);
        for(int i=1;i<=number;i++) {
            fact = fact*i;
        }
        System.out.println("factorial is : " +fact);
    }
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number= Sc.nextInt();
        display(number);
        


    
}
    
}
