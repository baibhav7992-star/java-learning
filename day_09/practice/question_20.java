package day_09.practice;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
/*
Question 15

Create a function that takes marks as parameter
and prints Pass or Fail.
*/

public class question_20 {
    static void printPassFail(int marks) {
        System.out.println("your marks are :" +marks);
        if(marks>=60 && marks<=100) {
            System.out.println("pass");
        }
        if(marks>=10 && marks<=60) {
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter your marks");
        int marks = Sc.nextInt();
        printPassFail(marks);

    
}
    
}
