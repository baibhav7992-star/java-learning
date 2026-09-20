package day_06.practice;
/*

Print:

0 -1 -2 -3
1  0 -1 -2
2  1  0 -1
3  2  1  0

*/
public class question_13 { public static void main(String[] args) {
    for(int i=1;i<=4;i++) {
        for(int j=1;j<=4;j++) {
            System.out.print((i-j)+ " ");
        }
        System.out.println();

    }
}
    
}
