package day_13.practice;
/*
Q15. Create a class Rectangle with variables:
length (int) and breadth (int).

Create two objects:
Rectangle 1: length = 10, breadth = 5
Rectangle 2: length = 8, breadth = 4

Print the length and breadth of both rectangles.

Expected Output:
Length: 10, Breadth: 5
Length: 8, Breadth: 4
*/
class rectangle {
    int length;
    int breadth;
    void display() {
        System.out.println("Length"+":"+ length+ ","+ "Breadth"+ ":" +breadth);
    }
}
public class question_07 {
    public static void main(String[] args) {
        rectangle r1= new rectangle();
        r1.length=10;
        r1.breadth=5;
        r1.display();
        rectangle r2= new rectangle();
        r2.length=8;
        r2.breadth=4;
        r2.display();
    
}
    
}
