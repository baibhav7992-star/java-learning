package day_02.practice;

import java.util.Scanner;

/*
Question 01:
WAP to input your name, age and city, then print them in a proper format.
*/

public class question_10 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your name");
    String name = Sc.nextLine();
    System.out.println("enter your age");
    int age = Sc.nextInt();
    System.out.println("enter your city");
    String city = Sc.nextLine();
    System.out.println("name" +name);
    System.out.println("age" +age);
    System.out.println("city" +city);
    Sc.close();


    
}
    
}
