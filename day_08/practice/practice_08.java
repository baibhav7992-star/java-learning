package day_08.practice;
/*

Count Digits

Number = 12345

Expected Output:

5

Hint:
num = num / 10

*/
public class practice_08 { public static void main(String[] args) {
    int count=0;
    int num=12345;
    while(num!=0) {
        count++;
        num=num/10;
    }
    System.out.println("total count"+count);
    
}
    
}
