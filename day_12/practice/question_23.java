package day_12.practice;

public class question_23 {
    /*
Q2. Given array:
{10, 50, 30, 80, 60}

Array ka second-largest element find karo.
Har element unique hai.

Expected Output:
Second largest = 60
*/
     public static void main(String[] args) {
        int number[] = {10, 50, 30, 80, 60};
         int target = 60;
         boolean found= false;
         for(int i=0;i<number.length;i++) {
            if(target==number[i]) {
                found=true;
            }
         }
         if(found==true) {
            System.out.println("Second largest number = " +target);
         }
    
}
    
}
