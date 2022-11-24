package Loops;
import java.util.Scanner;
public class DivisibleNumbers {
    public static void main(String[] args) {

        /* Ödev
         Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını
         hesaplayan programı yazınız.
         */
       Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");

        int sum = 0,counter = 0;
        double avg;
       int num = input.nextInt();

       for(int i=0;i<=num;i++){
           if(i%12==0){
                sum += i;
                counter++;

           }
       }
       avg = (sum/counter);
        System.out.println(avg);





    }
}
