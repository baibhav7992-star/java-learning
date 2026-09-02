package day_02.practice;

import java.util.Scanner;

/*
Question 03:
WAP to input two numbers and print their sum.
*/


public class question_03 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter first number");
    int a = Sc.nextInt();
    System.out.println("Enter second number");
    int b = Sc.nextInt();
    int sum = a+b;
    System.out.println("the sum is" +sum);
    Sc.close();
    
}
    
}
