package day_05.practice;
import java.util.Scanner;
/*
Input N.

Count how many numbers from 1 to N
are divisible by either 4 or 6.
*/
public class question_19 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your number");
    int number = Sc.nextInt();
    int count = 0;
    for(int i=1;i<=number;i++)
    {
        if(i%4==0 && i%6==0)
            count++;
    }
    System.out.println("total count is" +count);
    
}
    
}
