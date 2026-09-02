package day_02.practice;

import java.util.Scanner;

/*
Question 07:
WAP to input length and breadth of a rectangle and find its area.
*/

public class question_06 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter length");
    int length = Sc.nextInt();
    System.out.println("enter breadth");
    int breadth = Sc.nextInt();
    int area = length*breadth;
    System.out.println("the area is" +area);
    Sc.close();

    
}
    
}
