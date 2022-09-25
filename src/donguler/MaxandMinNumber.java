package donguler;

import java.util.Scanner;
public class MaxandMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz ?");
        int count  = sc.nextInt();

        int num;
        int tempNum = Integer.MIN_VALUE;
        int tempNum2 = Integer.MAX_VALUE;

       for(int i=1;i<=count;i++){
           System.out.println(i+". sayıyı giriniz: ");
           num = sc.nextInt();

           if(num>=tempNum){
               tempNum = num;
           }

           if((num<tempNum) && (num<tempNum2)){
               tempNum2 = num;
           }

       }

        System.out.println("En yüksek değer "+tempNum+"\n" +
                            "En düşük değer: "+tempNum2);

    }
}
