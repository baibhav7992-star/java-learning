package day_12.practice;

public class question_15 { 
    /*
Q7. Given array:
{12, 7, 8, 5, 10, 3}

for loop aur if condition se even numbers count karo.

Expected Output:
Even count = 3
*/
    public static void main(String[] args) {
        int number[] = {12, 7, 8, 5, 10, 3};
        int count=0;
        for(int i=0;i<number.length;i++) {
            if(i%2==0) {
                count = count+1;
            }
        }
        System.out.println("Total count is : " +count);
    
}
    
}
