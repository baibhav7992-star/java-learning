package day_03.practice;
import java.util.Scanner;
/*
Q1. Write a program to input three numbers and determine:

1. Whether all three numbers are equal.
2. Whether exactly two numbers are equal.
3. Whether all three numbers are different.

Display the appropriate message.

Examples:
10 10 10 -> All numbers are equal
10 10 20 -> Exactly two numbers are equal
10 20 30 -> All numbers are different
*/
public class question_10 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter num1");
    int num1 = Sc.nextInt();
    System.out.println("enter num2");
    int num2 = Sc.nextInt();
    System.out.println("enter num3");
    int num3 = Sc.nextInt();
    if(num1 == num2 && num2 == num3)
        System.out.println("All number are equal");
    else if(num1 == num2 && num2 != num3)
        System.out.println("Exactly Two number are same");
    else
        if(num1 != num2 && num2!= num3)
            System.out.println("All numbers are different");
    Sc.close();






    
}
    
}
