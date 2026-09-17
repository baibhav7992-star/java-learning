package day_03.practice;
import java.util.Scanner;

/*
Q2. Write a program to input the age of a person and check
whether the person is eligible to vote or not.
A person is eligible to vote if age is 18 years or above.
*/
public class queston_02 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your age:");
    int age = Sc.nextInt();
    if(age>=18)
        System.out.println("eligible to vote");
    else
        System.out.println("not eligible to vote");
    Sc.close();

    
}
    
}
