package day_03.practice;
import java.util.Scanner;
/*
Q1. Write a program to input a number from the user and check
whether the number is positive, negative, or zero.
*/

public class question_01 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter you number :");
    int number = Sc.nextInt();
    if(number==0)
        System.out.println("zero number");
    else if(number>0)
        System.out.println("positive number");
    else
        System.out.println("negative number");
    Sc.close();


}

    
}
