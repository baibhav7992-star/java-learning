package day_05.practice;
import java.util.Scanner;
/*
Q4. Input N and find factorial of N only using a for loop.
*/
public class question_25 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your number");
    int number = Sc.nextInt();
    int fact = 1;
    for(int i =1;i<=number;i++)
    {
        fact = fact*i;
    }
    System.out.println("req factorial is" +fact);
    
    
}
    
}
