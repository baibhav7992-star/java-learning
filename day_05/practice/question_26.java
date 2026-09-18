package day_05.practice;
import java.util.Scanner;
/*
Q3. Input N and count how many multiplications
were performed while calculating factorial.

Example:
Input: 5

Factorial = 120
Multiplications = 5
*/
public class question_26 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your number");
    int number = Sc.nextInt();
    int fact = 1;
    int count = 0;
    for(int i =1; i<=number;i++)
    {
            count = count+1;
            fact = fact*i;
            


    }
    System.out.println("total mutiplicatin count is:" +count);
    System.out.println("factorial is:" +fact);
    
}
    
}
