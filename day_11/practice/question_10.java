package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes a number as parameter
and returns true if the number is even,
otherwise false.

Example:

Input:
8

Output:
true

*/
public class question_10 { 
    static String display(int number) {
        if(number%2==0) {
            return "even";

        }
        else {
            return "false";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int number=sc.nextInt();
        String result=display(number);
        System.out.println("req condition is :" +result);
    
}
    
}
