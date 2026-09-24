package day_09.practice;
 /*
Question 8

Create a function that takes a mobile name and price
and prints both.
*/
public class question_14 { 
    static void mobile(String name,int price) {
        System.out.println("Mobile name is :" +name);
        System.out.println("Mobile price is " +price);
    }
    public static void main(String[] args) {
        mobile("iphone",100000);
        mobile("samsung",98000);
    
}
    
}
