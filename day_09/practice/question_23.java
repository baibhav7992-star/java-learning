package day_09.practice;
import java.util.Scanner;
/*
Question 1

Create a function that takes a number as parameter
and prints whether it is Positive, Negative or Zero.
*/
public class question_23 {
    static void printNumber(int number) {
        System.out.println("your number is :" +number);
        if(number>0) {
            System.out.println("positive number");
        }
        else if(number<0) {
            System.out.println("negative number");
        }
        else {
            System.out.println("number is neither positive nor negative");
        }
    }

     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = Sc.nextInt();
        printNumber(number);
    
}
    
}
