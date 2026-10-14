package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes two numbers as parameters
and returns their product.

Example:

Input:
5 4

Output:
20

*/
public class question_8 { 
    static int display(int number1,int number2) {
        return number1*number2;

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter first number");
        int number1= Sc.nextInt();
    System.out.println("enter second number");
        int number2= Sc.nextInt();
        int number = display(number1,number2);
        System.out.println("Product of two number is " +number);

    
}
    
}
