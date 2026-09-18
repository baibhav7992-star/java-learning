package day_05.practice;

import java.util.Scanner;
/*
Input N.

Count how many numbers from 1 to N
are divisible by 3 but not divisible by 2.
*/
public class question_17 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter number");
    int number = Sc.nextInt();
    int count =0;
    for(int i=1;i<=number;i++)
    {
        if(i%3==0 && i%2!=0)
            count++;
    }
    System.out.println("total counted number is"+count);
    

    
}
    
}
