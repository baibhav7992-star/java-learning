package day_03.practice;
import java.util.Scanner;

/*
Q3. Write a program to input an integer and determine
whether it is even or odd.
*/

public class question_03 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your number");
    int number = Sc.nextInt();
    if(number%2==0)
        System.out.println("even");
    else
        System.out.println("odd");
    Sc.close();
    
}
    
}
