package day_10;
import java.util.Scanner;
/*
Question 7

Create a function that takes a number as parameter
and prints numbers from 1 to N.
*/
public class question_01 {
    static void display(int number) {
        System.out.println("your number is");
        for(int i=1;i<=number;i++) {
            System.out.println(i);
        }
    }
     public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number = Sc.nextInt();
        display(number);


    
}
    
}
