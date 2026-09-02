package day_02.practice;

import java.util.Scanner;
/*
Question 02:
WAP to input marks of 5 subjects and calculate total marks and percentage.
*/

public class question_11 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter math marks");
    float math = Sc.nextFloat();
    System.out.println("enter english marks");
    float english = Sc.nextFloat();
    System.out.println("enter physics marks");
    float physics = Sc.nextFloat();
    System.out.println("enter chemistry  marks");
    float chemistry = Sc.nextFloat();
    System.out.println("enter history  marks");
    float history = Sc.nextFloat();
    float sum = (math+english+physics+chemistry+history);
    float percentage = (sum*100)/500f;
    System.out.println("the req sum is" +sum);
    System.out.println("req percentage of 5 subject is" +percentage);
    Sc.close();


    

    
}
    
}
