package day_12.practice;
/*
Q2. Given array: {12, 45, 78, 23, 56}
    for loop aur if condition ka use karke sabse bade (Maximum) number 
    ka INDEX (पोजीशन) find karo. 
    (Hint: Variable mai value ke bajay 'i' ko store karo).

Expected Output:
Maximum Index = 2
*/

public class question_14 {
     public static void main(String[] args) {
        int number[] = {12, 45, 78, 23, 56};
        int maxIndex = number[0];
        for(int i=0;i<number.length;i++) {
            if(number[i]>number[maxIndex]) {
                maxIndex=i;

            }
        }
    System.out.println("Maximum Index = " + maxIndex);
    
}
    
}
