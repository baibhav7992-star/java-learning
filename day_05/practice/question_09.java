package day_05.practice;
import java.util.Scanner;
/*
Q10. Write a program to input a number N from the user and print numbers from 1 to N using a for loop.

Example Input:
5

Output:
1
2
3
4
5
*/
public class question_09 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your number");
    int number = Sc.nextInt();
    for(int i=1;i<=number;i++)
    {
        System.out.println(i);
    }

    
}
    
}
