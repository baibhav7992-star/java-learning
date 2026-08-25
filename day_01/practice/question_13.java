package day_01.practice;

public class question_13 { public static void main(String[] args) {
    // Q13: Write a Java program to calculate the final bill of 450, 800, 250, and 100 after a discount of 100.
    int a = 450;
    int b = 800;
    int c = 250;
    int d = 100;
    int finalBill = a+b+c+d;
    int discount = finalBill - 100;
    System.out.println("the final bill is" +finalBill);
    System.out.println("req discount is" +discount);

}
    
}
