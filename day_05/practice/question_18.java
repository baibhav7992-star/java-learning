package day_05.practice;
import java.net.SocketException;
import java.util.Scanner;
/*
Input N.

Count how many odd numbers
are present from 1 to N.
*/
public class question_18 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your number");
    int number = Sc.nextInt();
    int count = 0;
    for(int i=1;i<=number;i++)
    {
        if(i%2!=0)
            count++;
    }
    System.out.println("total odd count number between to to n is:" +count);




    
}
    
}
