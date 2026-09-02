package day_02.practice;

import java.util.Scanner;

/*
Question 01:
WAP to input your name and print it.
*/
public class question_01 { public static void main(String[] args) {
Scanner Sc = new Scanner(System.in);
System.out.println("Enter your name");
String name = Sc.nextLine();
System.out.println("your name is " +name);
Sc.close();
}
    
}
