package day_12.practice;
/*
Q4. Create an integer array:
    {10, 15, 22, 31, 40, 55}

    Use a for loop and if condition to count
    the even numbers in the array.

Expected Output:
3
*/
public class question_07 { 
    public static void main(String[] args) {
        int numbers[] = {10, 15, 22, 31, 40, 55};
        int count=0;
        if (numbers[0] % 2 == 0) { count++; }
        if (numbers[1] % 2 == 0) { count++; }
        if (numbers[2] % 2 == 0) { count++; }
        if (numbers[3] % 2 == 0) { count++; }
        if (numbers[4] % 2 == 0) { count++; }
        if (numbers[5] % 2 == 0) { count++; }
        System.out.println(count);
    
}
    
}
