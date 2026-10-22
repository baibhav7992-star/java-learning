
package day_13.learning;

class Student {
    String name = "Rahul";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassObjectBasics {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}
