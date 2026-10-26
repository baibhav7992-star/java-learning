package day_15.practice;

/*
Q4. Constructor and Area

Create a class named RectangleShape.
Declare:
int length;
int width;

Initialize both variables using a constructor.
Create a method calculateArea() that prints:
Area = length * width

Create an object with length = 10 and width = 5.

Expected Output:
Area: 50
*/
class RectangleShape {
    int length;
    int width;
    RectangleShape(int l , int w) {
        length = l;
        width = w;

        
    }

    
    
    
    void display() {
        System.out.println("Area"+ ":" +(length*width));
}
}
public class question_04 {
    public static void main(String[] args) {
        RectangleShape r1= new RectangleShape(10,5);
        r1.display();
}

}


