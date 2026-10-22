package day_13.practice;
/*
Q4. Create a class Car with variables:
brand and color.

Create one object:
brand = "BMW"
color = "Black"

Print both values.

Expected Output:
Brand: BMW
Color: Black
*/
class car {
    String brand;
    String color;
    void display() {
        System.out.println("Brand"+ "="+brand);
        System.out.println("Color"+ "="+color);
    }
}
public class question_03 { 
    public static void main(String[] args) {
        car c1= new car();
        c1.brand="BMW";
        c1.color="Black";
        c1.display();

    
}
    
}
