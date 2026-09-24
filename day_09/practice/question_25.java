package day_09.practice;
import java.util.Scanner;
/*
Question 4

Create a function that takes marks as parameter
and prints Grade.

90+ = A
75+ = B
60+ = C
Below 60 = D
*/
public class question_25 { 
    static void marks(int marks) {
        System.out.println("your marks is :" +marks);
        if(marks>=90 && marks<100) {
            System.out.println("A");
        }
        else if(marks>=75 && marks<90) {
            System.out.println("B");
        }
        else if(marks>=60 && marks<60) {
            System.out.println("c");
        }
        else {
            System.out.println("fai");
        }
        

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = Sc.nextInt();
        marks(marks);

    
}
    
}
