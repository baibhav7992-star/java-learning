package day_12.practice;

public class question_11 {
    
public class Main {
    public static void main(String[] args) {

        /*
         Q4. Given array:
         {10, 20, 30, 40, 50}

         for loop se elements ka average
         calculate karo.

         Expected Output:
         Average = 30.0
        */


    }
}

     public static void main(String[] args) {
        int number[] = {10, 20, 30, 40, 50};
        int average=0;
        int sum=0;
        for(int i=0;i<number.length;i++) {
            sum = sum+number[i];
            average = sum/number[i];
        }
        System.out.println("Req average is :" +average);
    
}
    
}
