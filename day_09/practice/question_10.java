package day_09.practice;
import java.util.Scanner;
/*
Question 4

Create a function that takes a student's name and age
and prints both.
*/
public class question_10 {
    static void student(String name,int age) {
        System.out.println("student name is" +name);
        System.out.println("student age is" +age);

        

    }
     public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter student name");
        String name = Sc.nextLine();
        System.out.println("enter student age");
        int age = Sc.nextInt();
        student(name,age);


    
}
    
}
