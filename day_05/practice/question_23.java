package day_05.practice;
import java.util.Scanner;
/*
Input N.

Find the sum of all numbers from 1 to N
that are divisible by 2 OR divisible by 3.
*/
public class question_23 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter the number");
    int number = Sc.nextInt();
    int sum = 0;
    for(int i=1;i<=number;i++)
    {
        if(i%2==0 && i%3==0)
            sum = sum+1;
    }
    System.out.println("req sum is" +sum);

}
    
}
