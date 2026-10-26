package day_15.practice;
/*
Q13. Create a class BoxSize.
- Variable: length.
- Constructor 1: no parameters, set length = 5.
- Constructor 2: one int parameter, initialize length.
- Create two objects using different constructors.
- Display length of both objects.

Expected Output:
Length: 5
Length: 10
*/
class BoxSize {
    int length;
    BoxSize() {
        length = 5;
    }
    BoxSize(int l) {
        length = 1;
    }
    void display() {
        System.out.println("Length: " + length);
    }

}
public class question_08 { 
    public static void main(String[] args) {
        BoxSize box1 = new BoxSize();
        BoxSize box2 = new BoxSize(10);
        box1.display();
        box2.display();
    
}
    
}
