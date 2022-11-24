package Loops;
import java.util.Scanner;

public class PowersofFourandFive {
    public static void main(String[] args) {
        /*
         Ödev:
         Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.


         */
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz.");
        int num = input.nextInt();

        for(int i = 1,k=1,j=0; i<=num && k<=num  ; i *= 4,k*=5,j++){
            System.out.println("4^"+j+"="+i+" 5^"+j+"="+k);
        }

    }
}
