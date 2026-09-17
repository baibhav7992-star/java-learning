package day_03.practice;
import java.util.Scanner;
/*
Q7. Write a program to input a year and check
whether it is a leap year or not.
*/
public class question_07 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter year");
    int year = Sc.nextInt();
    if(year%4==0)
        System.out.println("leap year");
    else
        System.out.println("not leap year");
    Sc.close();
    
}
    
}
