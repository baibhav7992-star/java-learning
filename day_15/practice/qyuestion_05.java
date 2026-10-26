package day_15.practice;

/*
Q5. Constructor and Circle Area

Create a class named CircleShape.
Declare:
double radius;

Initialize radius using a parameterized constructor.
Create a method calculateArea().

Formula:
Area = 3.14159 * radius * radius

Create an object with radius = 5.

Expected Output:
Area: approximately 78.54
*/
class CircularShape {
    double radius;
    CircularShape(double r) {
        radius = r;
    }
    void display() {
        double area = 3.14f * radius * radius;
        System.out.println("Area"+ ":" +area);
        
    }

}

public class qyuestion_05 { 
    public static void main(String[] args) {
        CircularShape s1 = new CircularShape(5);
        s1.display();
    
}
    
}
