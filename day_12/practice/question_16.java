package day_12.practice;
/*
Q9. Given array:
{40, 20, 60, 70, 90}

Check karo ki 90 array mein hai ya nahi.

Expected Output:
Number found
*/
public class question_16 {
    public static void main(String[] args) {
        int number[] = {40, 20, 60, 70, 90};
        int target = 90;
        boolean found = false;
        for(int i=0;i<number.length;i++) {
            if(target==number[i]) {
                found=true;
            }
        }
        if(found==true) {
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }


    
}
    
}
