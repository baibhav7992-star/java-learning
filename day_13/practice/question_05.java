package day_13.practice;

class StudentQ8 {
    String name;
    int marks;

    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class question_05 {
    public static void main(String[] args) {
        StudentQ8 s1 = new StudentQ8();

        s1.name = "Rahul";
        s1.marks = 70;
        s1.display();

        s1.marks = 85;
        s1.display();
    }
}