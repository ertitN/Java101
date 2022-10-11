package Methods;
import java.util.Scanner;

public class PalindromicNumber {

    static boolean ifPalindrom(int number){
            int tempNumber = number;
            int reverseNumber = 0;

        while(tempNumber!=0){

            reverseNumber = (reverseNumber * 10) + (tempNumber%10); // 1

            tempNumber/=10;
        }
        if(number == reverseNumber){

            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        int sayi = scan.nextInt();

        System.out.println(ifPalindrom(sayi));



    }
}
