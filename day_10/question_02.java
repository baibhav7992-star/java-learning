package day_10;
import java.util.Scanner;
/*
Question 8

Create a function that takes a number as parameter
and prints numbers from 1 to N.only even number
*/
public class question_02 {
    static void display(int number) {
        System.out.println("your number are" +number);
        for(int i=1;i<=number;i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = Sc.nextInt();
        display(number);
    
}
    
}
