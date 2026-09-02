package day_02.practice;

import java.util.Scanner;
/*
Question 14:
WAP to input principal, rate and time and calculate Simple Interest.
*/

public class question_09 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter principal");
    float p = Sc.nextFloat();
    System.out.println("enter rate");
    float r = Sc.nextFloat();
    System.out.println("enter time");
    float t = Sc.nextFloat();
    float si = (p*r*t)/100f;
    System.out.println("the req simple interest is" +si);
    Sc.close();

    
}
    
}
