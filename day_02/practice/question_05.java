package day_02.practice;

import java.util.Scanner;
/*
Question 05:
WAP to input two numbers and print their product.
*/

public class question_05 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a");
    int a = Sc.nextInt();
    System.out.println("enter b");
    int b = Sc.nextInt();
    int product = a*b;
    System.out.println("the product is" +product);
    Sc.close();
    
}
    
}
