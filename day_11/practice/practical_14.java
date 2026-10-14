package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes a number as parameter
and returns the sum of digits.

Example:

Input:
1234

Output:
10

*/
public class practical_14 { 
    static int display(int number) {
        int sum=0;
        int rem;
        while(number>0) {
            rem=number%10;
            sum = sum+rem;
            number=number/10;

        
        
        
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = Sc.nextInt();
        int result = display(number);
        System.out.println("the sum of user input number is :" +result);

    
}
    
}
