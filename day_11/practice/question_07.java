package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes two numbers as parameters
and returns their sum.

Example:

Input:
10 20

Output:
30

*/
public class question_07 {
    static int giveSum(int number1,int number2) {
        return number1+number2;
    }
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number1");
        int number1 = Sc.nextInt();
        System.out.println("enter number2");
        int number2 = Sc.nextInt();
        int number = giveSum(number1,number2);
        System.out.println("your sum is" +number);
        



    
}
    
}
