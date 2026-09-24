package day_09.practice;
import java.util.Scanner;
/*
Question 19

Create a function that takes employee name
and salary and prints both.
*/
public class question_22 { 
    static void employee(String name,int salary) {
        System.out.println("your name is :" +name);
        System.out.println("your salary is :" +salary);

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        employee("ramesh" ,50000);
        employee("mahesh",90000);
    
}
    
}
