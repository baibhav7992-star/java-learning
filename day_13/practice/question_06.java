package day_13.practice;
/*
Q11. Create a class Fan with variables:
brand (String) and speed (int).

Create two objects:
Fan 1: Havells, 3
Fan 2: Crompton, 5

Print the brand and speed of both fans.

Expected Output:
Havells 3
Crompton 5
*/
class fan {
    String brand;
    int speed;
    void display() {
        System.out.println(brand+ " " +speed);
        
    }
}
public class question_06 {
    public static void main(String[] args) {
        fan f1= new fan();
        f1.brand="Havells";
        f1.speed=3;
        f1.display();
        fan f2= new fan();
        f2.brand="Crompton";
        f2.speed=5;
        f2.display();

    
}
    
}
