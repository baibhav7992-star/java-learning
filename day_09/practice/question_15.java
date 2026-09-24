package day_09.practice;
import java.util.Scanner;
/*
Question 9

Create a function that takes length and breadth
and prints area of rectangle.
*/
public class question_15 { 
    static void printArea(int length,int breadth) {
        int Area = length*breadth;
        System.out.println("area of rectangle is :" +Area);
        
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your length");
        int length = Sc.nextInt();
        System.out.println("enter breadth");
        int breadth = Sc.nextInt();
        printArea(length,breadth);
        

    
}
    
}
