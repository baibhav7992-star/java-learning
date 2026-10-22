package day_13.practice;

/* 
Q3. Create a class Student with variables: name and age.
Create two objects:
First: Aman, 19
Second: Rohit, 21
Print the details of both students.

Expected Output:
Aman 19
Rohit 21
*/

class Student { // Class names should ideally start with a capital letter
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class question_02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 19;
        Student s2 = new Student();
        s2.name = "Rohit";
        s2.age = 21;
        s1.display();
        s2.display();
    }
}