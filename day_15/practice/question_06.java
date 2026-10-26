package day_15.practice;
/*
Q11. Create a class WatchDetails.
- Variables: brand, price.
- Create a no-argument constructor.
- Set brand = "Casio" and price = 2500.
- Create a display() method.

Expected Output:
Brand: Casio
Price: 2500
*/
class WatchDetails {
    String brands;
    int price;
    WatchDetails(String b , int p) {
        brands=b;
        price=p;
    }
    void display() {
        System.out.println("Brand"+ ":" +brands);
        System.out.println("Price"+ ":" +price);
    }
}

public class question_06 { 
    public static void main(String[] args) {
        WatchDetails w1 = new WatchDetails("Casio" , 2500);
        w1.display();
    
}
    
}
