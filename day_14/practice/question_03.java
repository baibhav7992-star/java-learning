package day_14.practice;
/*
Q4. Create a class named Student1.
Create a void method showDetails(String name, int age)
that accepts a student's name and age and prints them.
Call the method with "Rahul" and 20.

Expected Output:
Name: Rahul
Age: 20
*/
class Student1 {
    void showDetails(String name,int age) {
        System.out.println("Name"+ ":" +name);
        System.out.println("Age"+ ":" +age);
    }
}


public class question_03 { 
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.showDetails("Rahul",20);
        


    
}
    
}
