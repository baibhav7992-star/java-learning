package day_03.practice;
import java.util.Scanner;
/*
Q6. Write a program to input three numbers and find
the largest among them using if-else statements.
*/
public class question_06 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter first number:" );
    int number1 = Sc.nextInt();
    System.out.println("enter Second number:" );
    int number2 = Sc.nextInt();
    System.out.println("enter third number:" );
    int number3 = Sc.nextInt();
    if(number1> number2)
        System.out.println("number1 is largest");
    else if(number2>number3)
        System.out.println("number2 is largest");
    else
        System.out.println("number3 is largest");
    Sc.close();

     
        



    
    
}
    
}
