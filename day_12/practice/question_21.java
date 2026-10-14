package day_12.practice;

public class question_21 {
    /*
Q9. Given array:
{10, 20, 30, 40, 50}

Check karo ki 30 array mein hai ya nahi.

Expected Output:
Number found
*/
    public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false;
        for(int i=0;i<number.length;i++) {
            if(target==number[i]) {
                found=true;

            }

        }
        if(found=true) {
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }


    
}
    
}
