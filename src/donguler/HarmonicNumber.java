package donguler;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");
        int num = sc.nextInt();
        double total = 0;
        // 5

        for(double i=1;i<=num;i++){

            total += (1/i); // 1

        }

        System.out.println(total);
    }
}
