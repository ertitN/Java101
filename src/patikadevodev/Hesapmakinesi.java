
package patikadevodev;
import java.util.Scanner;

public class Hesapmakinesi {
    public static void main(String[] args) {
        // ******   Switch-Case ile Hesap Makinesi uygulaması   ****
        int a,b,select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz.");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz.");
        b= input.nextInt();

        System.out.println("Toplama:1 \nÇıkarma:2\nÇarpma:3\nBölme:4");

        select = input.nextInt();

        switch(select){
            case 1 :
                System.out.println("Toplam: "+(a+b));
                break;
            case 2 :
                System.out.println("Çıkarma: "+(a-b));
                break;
            case 3 :
                System.out.println("Çarpma: "+(a*b));
                break;

            case 4 :
                if(b!=0){
                System.out.println("Bölme: "+(a/b));
            }else{
                System.out.println("Hatalı giriş\nBir sayı sıfıra bölünemez.");
            }
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz.");
        }



    }
}
