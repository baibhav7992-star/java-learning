package day_09.practice;
import java.util.Scanner;
/*
Question 10

Create a function that takes side of square
and prints area of square.
*/
public class question_16 { 
    static void printArea(int side1,int side2) {
        int area = side1*side2;
        System.out.println("area of square is :" +area);

    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter your side1");
        int side = Sc.nextInt();
        System.out.println("enter yor side2");
        int side2 = Sc.nextInt();
        printArea(side,side2);
    
}
    
}
