package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxandMinNearestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int value = input.nextInt();

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);



        int maxNearest = list[list.length - 1];
        int minNearest = list[0];


        for (int i : list) {

            if (i > value && i < maxNearest) {
                maxNearest = i;
            }

            if (i < value && i > minNearest) {
                minNearest = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " +minNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı: "+maxNearest);

    }


}
