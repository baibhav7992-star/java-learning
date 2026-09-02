package day_02.practice;

import java.util.Scanner;

/*
Question 13:
WAP to input three numbers and find their average.
*/

public class question_08 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter first number");
    float a = Sc.nextFloat();
    System.out.println("enter second number");
    float b = Sc.nextFloat();
    System.out.println("enter third number");
    float c = Sc.nextFloat();
    float average = (a+b+c)/3f;
    System.out.println("req average of three number is" +average);
    Sc.close();

    
}
    
}
