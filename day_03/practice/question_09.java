package day_03.practice;
import java.util.Scanner;

/*
Q1. Write a program to input marks and display:

90-100  -> Excellent
75-89   -> Very Good
60-74   -> Good
33-59   -> Pass
Below 33 -> Fail
*/
public class question_09 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter marks");
    int marks = Sc.nextInt();
    if(marks>90 &&marks<100)
        System.out.println("Excellent");
    else if(marks>75 &&marks<89)
        System.out.println("Very Good");
    else if(marks>60 &&marks<74)
        System.out.println("Good");
    else if(marks>33 &&marks<59)
        System.out.println("Pass");
    else
        if(marks<33)
            System.out.println("fail");
    Sc.close();


    
}
    
}
