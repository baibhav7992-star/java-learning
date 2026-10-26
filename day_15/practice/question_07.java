package day_15.practice;
/*
Q12. Create a class LaptopDetails.
- Variables: brand, price.
- Create a parameterized constructor.
- Pass values while creating two objects.
- Display both objects.

Expected Output:
Brand: Lenovo
Price: 70000
Brand: HP
Price: 60000
*/
class LaptopDetails {
    String brand;
    int price;
    LaptopDetails(String b , int p) {
        brand=b;
        price=p;
    }
    void display() {
        System.out.println("Brand"+ ":" +brand);
        System.out.println("Price"+ ":" +price);
    }
}
public class question_07 { 
    public static void main(String[] args) {
        LaptopDetails d1 = new LaptopDetails("Lenovo",70000);
        LaptopDetails d2 = new LaptopDetails("HP",60000);
        d1.display();
        d2.display();


    
}
    
}
