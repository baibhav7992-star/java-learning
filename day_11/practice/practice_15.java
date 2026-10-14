package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes a number as parameter
and returns the reverse of the number.

Example:

Input:
1234

Output:
4321

*/
public class practice_15 {
    static int display(int number) {
        int rem;
        int reverse=0;
        while(number>0) {
            rem=number%10;
            reverse= (reverse*10)+rem;
            number=number/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = Sc.nextInt();
        int reverse = display(number);
        System.out.println("reverse of given number is : " +reverse);
    
    
    
}
    
}
