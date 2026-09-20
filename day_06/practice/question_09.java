package day_06.practice;
/*

Print the following pattern:

1 2 3 4
1 2 3
1 2
1

*/
public class question_09 { public static void main(String[] args) {
    for(int i=1;i<=4;i++) {
        for(int j=1;j<=5-i;j++) {
            System.out.print(j+ " ");
        }
        System.out.println();
    }
        
    
}
    
}
