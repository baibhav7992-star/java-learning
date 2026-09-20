package day_06.practice;
/*

Print the following pattern:

A
A A
A A A
A A A A

*/
public class question_08 { public static void main(String[] args) {
    for(int i=1;i<=4;i++) {
        for(int j=1;j<=i;j++) {
            System.out.print("A");
        }
        System.out.println();
    }
    
}
    
}
