package day_13.practice;
/*
Q1. Create a class Student with two variables:
name (String) and age (int).

Create one object and assign:
name = "Rahul"
age = 20

Print the name and age.

Expected Output:
Name: Rahul
Age: 20
*/
class Student {
    String name;
    int age;
    void display() {
        System.out.println("name"+ "="+name);
        System.out.println("Age"+ "="+age);
    }
}

public class question_01 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Rahul";
        s1.age=20;
        s1.display();

    
}
    
}
