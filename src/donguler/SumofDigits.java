package donguler;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,total = 0,quotient = 0;
        System.out.println("Bir sayı giriniz.");

        num = scan.nextInt();

        do{

             total += (num%10);
            System.out.println(num%10);
            num /=10;

        }
        while(num!=0);

        System.out.println("Toplam: "+total);
    }
}
