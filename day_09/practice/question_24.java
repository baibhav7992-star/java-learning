package day_09.practice;
import java.util.Scanner;
/*
Question 2

Create a function that takes a number as parameter
and prints whether it is divisible by 5 or not.
*/
public class question_24 {
    static void printDivisible(int number) {
        System.out.println("your number is :" +number);
        if(number%5==0) {
            System.out.println("divisible");
        }
        else {
            System.out.println("not divisible");
        }
    }
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = Sc.nextInt();
        printDivisible(number);


    
}
    
}
