package day_03.practice;
import java.util.Scanner;

/*
Q4. Write a program to input two numbers and display
the larger number.
*/

public class question_04 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your first number");
    int number1 = Sc.nextInt();
    System.out.println("enter your second number");
    int number2 = Sc.nextInt();
    if(number1 >number2)
        System.out.println("number1  is greater");
    else
        System.out.println("number2 is greater");
    Sc.close();
    
    
}
    
}
