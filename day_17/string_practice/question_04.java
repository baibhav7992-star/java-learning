package day_17.string_practice;
import java.util.Scanner;
/*
Q4. WAP to input a full name using Scanner
and print the complete name.

Input:
Vaibhav Kumar

Expected Output:
Vaibhav Kumar
*/
public class question_04 { 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your name"+ ":");
        String name=Sc.nextLine();
        System.out.println(name);
        System.out.println(name.charAt(0));
        

    
}
    
}
