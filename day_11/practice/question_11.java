package day_11.practice;
import java.util.*;
/*

WAP to create a function that takes age as parameter
and returns true if eligible for voting,
otherwise false.

Voting Age = 18

Example:

Input:
21

Output:
true

*/
public class question_11 { 
    static String display(int age) {
        if(age>=18) {
            return "eligible to vote";
        }
        else {
            return "not eligible to vote";
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = Sc.nextInt();
        String eligible = display(age);
        System.out.println("you are eligible to vote r not : " +eligible);




    
}
    
}
