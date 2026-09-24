package day_09.practice;
import java.util.Scanner;
/*
Question 7

Create a function that takes a number as parameter
and prints all even numbers from 1 to N.
*/
public class question_29 { 
    static void display(int number) {
        System.out.println("your number is :" +number);
        for(int i=1;i<=number;i++) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = Sc.nextInt();
        display(number);
    
}
    
}
