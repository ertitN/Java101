package donguler;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum = 0;
        System.out.println("Bir sayı giriniz.");

        num = input.nextInt();

        for(int i=1;i<num;i++){

            if(num%i==0){
                sum += i;
            }
        }

        if(sum==num){
            System.out.println(num+" sayısı mükemmel sayıdır.");
        }
        else{
            System.out.println(num+" sayısı mükemmel sayı DEĞİLDİR");
        }

    }
}
