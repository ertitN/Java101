package donguler;
import java.util.Scanner;

public class EvenNumberDivisibleByFour {
    public static void main(String[] args) {

        /*
        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
        4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner input = new Scanner(System.in);

        int num;
        int sum = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();

            if(num%4==0){
                sum +=num;
               }

            }
            while(num%2==0);
        System.out.println("Toplam: "+ sum);

    }
}
