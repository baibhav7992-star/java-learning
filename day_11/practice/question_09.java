package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes two numbers as parameters
and returns the greater number.

Example:

Input:
10 20 30

Output:
30

*/
public class question_09 { 
    static int display(int number1,int number2,int number3) {
        if(number1>number2 && number1>number3) {
            return number1;
        } 
        else if(number2>number1 && number2>number3) {
            return number2;
        }
        else {
            return number3;
        }
        
            
        
    }


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter yout first number");
        int number1 = Sc.nextInt();
        System.out.println("Enter yout second number");
        int number2 = Sc.nextInt();
        System.out.println("Enter yout third number");
        int number3 = Sc.nextInt();
        int greater = display(number1,number2,number3);
        System.out.println("greater number is : " +greater);
        
    
}
    
}
