package day_08.practice;
/*

Find Sum:

1 + 2 + 3 + 4 + 5

Using while loop

Expected Output:

15

*/
public class question_05 { public static void main(String[] args) {
    int sum = 0;
    int i=1;
    while(i<=5) {
        sum = sum+i;
        i++;
    }
    System.out.println("total sum is" +sum);

    
}
    
}
