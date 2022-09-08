
package patikadevodev;
import java.util.Scanner;


public class DairedilimiAlani {
    public static void main(String[] args) {
        int r;
        int alpha;
        double pi = 3.14;
        double range;
        System.out.print("Yarıçap değerini giriniz.");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();

        System.out.print("Merkez açı değerini giriniz.");
        alpha = input.nextInt();

        range = (pi * (r*r) * alpha)/360;
        System.out.println("Daire diliminin alanı: "+range);




    }
}
