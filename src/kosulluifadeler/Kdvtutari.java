package kosulluifadeler;
import java.util.Scanner;
public class Kdvtutari {
    public static void main(String[] args) {
        double kdvorani= 0.18,paradegeri,kdvliparadegeri,kdvtutari;

        Scanner input = new Scanner(System.in);
        System.out.println("Para değerini giriniz:");
        paradegeri = input.nextDouble();
        kdvorani = (paradegeri>0)&&(paradegeri< 1000) ? kdvorani : 0.08;
        kdvliparadegeri = paradegeri * (1 + kdvorani);
        kdvtutari = kdvliparadegeri - paradegeri;

        System.out.println("Kdv'siz fiyat: "+paradegeri+
                            "\nKdv oranı: "+kdvorani+
                            "\nKdv'li fiyat: "+kdvliparadegeri+
                            "\nKdv tutarı: "+kdvtutari);



    }
}
