package day_12.practice;

public class question_20 {
    /*
Q5. Given array:
{25, 10, 80, 5, 40}

for loop aur if condition se maximum number find karo.

Expected Output:
Maximum = 80
*/
     public static void main(String[] args) {
        
        int number[] = {25, 10, 80, 5, 40};
        int maximum = number[0];
        for(int i=0;i<number.length;i++) {
            if(number[i]>maximum) {
                maximum=number[i];

            }
        }
        System.out.println("Maximum = " +maximum);

    
}
    
}
