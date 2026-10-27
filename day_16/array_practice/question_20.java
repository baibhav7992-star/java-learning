package day_16.array_practice;
/*
Q4. Count Even and Odd Numbers

Question:
Count how many even and odd numbers are present
in the given array.

Input:
int[] arr = {12, 7, 8, 15, 20, 3, 11};

Expected Output:
Even numbers: 3
Odd numbers: 4
*/
public class question_20 { 
    public static void main(String[] args) {
        int[] arr = {12, 7, 8, 15, 20, 3, 11};
        int EvenCount=0;
        int OddCount=0;
        for(int i=0;i<arr.length;i++) {
            if(i%2==0) {
                EvenCount++;
            }
            else {
                OddCount++;
            }
        }
        System.out.println("Even numbers"+ ":" +EvenCount);
        System.out.println("Odd numbers"+ ":" +OddCount);
        
    
}
    
}
