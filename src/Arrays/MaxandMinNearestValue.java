package Arrays;

import java.util.Scanner;

public class MaxandMinNearestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int value = input.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0};
        int maxNearestValue = list[0] ;
        int minNearestValue = list[0] ;

        for(int i:list){

            if( i>value && (i-value) < Math.abs(maxNearestValue-value)){
                maxNearestValue = i;
            }

            if( i<value && Math.abs(i-value) <Math.abs( minNearestValue-value )){
                minNearestValue = i;
            }

        }


        System.out.println("Girilen sayıdan küçük en yakın sayı: "+minNearestValue);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+maxNearestValue);


    }


}
