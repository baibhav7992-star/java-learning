package day_02.practice;

import java.util.Scanner;
/*
Question 09:
WAP to input radius of a circle and find its area.
*/

public class question_07 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter radius");
    float radius = Sc.nextFloat();
    float area = 3.14f*radius*radius;
    System.out.println("the area is" +area);
    Sc.close();

    
}
    
}
