package patikadevodev;
import java.util.Scanner;

public class Ucgeninalani {
    public static void main(String[] args) {
        int a,b,c,u;
        int alan;



        Scanner scan = new Scanner(System.in);

        System.out.println("1. kenar uzunluğunu giriniz.");
        a = scan.nextInt();

        System.out.println("2. kenar uzunluğunu giriniz.");
        b = scan.nextInt();

        System.out.println("3.kenar uzunluğunu giriniz.");
        c = scan.nextInt();
        if(a+b>c && a+c>b && b+c>a) {
            u = (a + b + c) / 2;
            alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));
            System.out.println("Üçgenin alanı: " + alan);
        } else
        {
            System.out.println("Girdiğiniz değerler bir üçgeni oluşturmuyor.");
        }

    }

}
