package day_01.practice;

public class question_09 { public static void main(String[] args) {
    // Q9: Write a Java program to find the final price of 2500 after a discount of 400.
    int total = 2500;
    int discount = 400;
    int price = (total-discount);
    float percentage = ((price*100f)/400);
    System.out.println("the final price is " +price);
    System.out.println("req final price percentage is" +percentage);


}
    
}
