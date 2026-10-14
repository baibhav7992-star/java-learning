package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes a number as parameter
and returns the factorial of the number.

Example:

Input:
5

Output:
120

*/
public class qustion_13 { 
    static int display(int number) {
        int fact=1;
        for(int i=1;i<=number;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = Sc.nextInt();
        int factorial = display(number);
        System.out.println("your factorial of given number is : " +factorial);

    
}
    
}
