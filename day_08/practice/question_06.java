package day_08.practice;
/*

Find Sum:

1 + 2 + 3 + ... + 10

Expected Output:

55

*/
public class question_06 { public static void main(String[] args) {
    int sum =0;
    int i=1;
    while(i<=10) {
        sum=sum+i;
        i++;
    }
    System.out.println("total sum is :" +sum );
    
}
    
}
