package day_12.practice;



public class question_17 {
    /*
Q10. Given array:
{10, 20, 10, 30, 10, 40}

for loop se count karo ki number 10 kitni baar aaya hai.

Expected Output:
10 occurs 3 times
*/
    public static void main(String[] args) {
        int number[] = {10, 20, 10, 30, 10, 40};
        int count = 0;
        int target = 10;
        boolean found=false;
        for(int i=0;i<number.length;i++) {
            if(target==number[i]) {
                count=count+1;
            }
        }
        System.out.println(target + "occurs"+count+"times");
        

    
    }



    
}
