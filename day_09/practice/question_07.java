package day_09.practice;
import java.util.Scanner;
/*
Question 1

Create a function that takes a number as parameter
and prints whether it is Even or Odd.

Test Data:
10
7
*/
public class question_07 {
    static void number(int number) {
        if(number%2==0) {
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
     public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = Sc.nextInt();
        number(number);
        Sc.close();



    
}
    
}
