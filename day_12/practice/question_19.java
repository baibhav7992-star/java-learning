package day_12.practice;

public class question_19 { 
    /*
Q3. Given array:
{10, 20, 30, 40, 50}

for loop se saare elements ka sum nikalo.

Expected Output:
Sum = 150
*/
    public static void main(String[] args) {
        int sum=0;
        int number[] = {10, 20, 30, 40, 50};
        for(int i=0;i<number.length;i++) {
            sum=sum+number[i];
        }
        System.out.println("Sum=" +sum);



    
}
    
}
