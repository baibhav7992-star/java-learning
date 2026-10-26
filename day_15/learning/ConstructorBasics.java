
package day_15.learning;

class GamingLaptop {
    String brand;
    int price;

    // Parameterized Constructor
    GamingLaptop(String b, int p) {
        brand = b;
        price = p;

        System.out.println("Constructor Called!");
    }

    // Display Method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class ConstructorBasics {
    public static void main(String[] args) {

        // Creating first object
        GamingLaptop l1 = new GamingLaptop("Lenovo", 70000);

        // Creating second object
        GamingLaptop l2 = new GamingLaptop("HP", 60000);

        // Calling methods
        l1.display();
        l2.display();
    }
}
