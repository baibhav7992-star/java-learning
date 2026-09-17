package day_03.practice;
import java.util.Scanner;

/*
Q5. Write a program to input marks obtained by a student
and determine whether the student has passed or failed.
A student passes if marks are 33 or above.
*/

public class question_05 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter marks");
    int marks = Sc.nextInt();
    if(marks>=33)
        System.out.println("Student is passed");
    else
        System.out.println("Student is failed");
    Sc.close();
    
}
    
}
