package day_10;
import java.util.Scanner;
/*
Question 2

Create a function that takes two numbers as parameters
and prints the greater number.
*/
public class question_04 { 
    static void displayGreater(int number1,int number2) {
        if(number1>number2) {
            System.out.println("number1 is greater");
        }
        else {
            System.out.println("number2 is greater");
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = Sc.nextInt();
        System.out.println("Enter your second number");
        int number2 = Sc.nextInt();

        displayGreater(number1,number2);
    
}
    
}
