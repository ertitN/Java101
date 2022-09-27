package donguler;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int firstNum = 0,secondNum = 1;
         int result;
        System.out.print(n+" elemanlı fibonacci dizisi: ");
        for(int i=1;i<=(n+1);i++){
            System.out.print(" "+firstNum);

            result =  firstNum+ secondNum;
                     firstNum = secondNum;
                     secondNum = result;

        }

    }
}
