package patikadevodev;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {

        double perKm = 2.20;
        double km;
        double total;
        int startPrice = 10;
        double minPrice = 20;
        System.out.println("Lütfen gidilecek mesafeyi km türünden giriniz.\n Ör: 800m = 0,8 5km = 5  ...");
        Scanner input = new Scanner(System.in);
        km = input.nextDouble();
        total = startPrice + (km * perKm);
        if(km>0 && total <= minPrice){

            System.out.println("Taksimetre tutarı: "+minPrice+"TL");
        }
        else if(km>0 && total>minPrice){

            System.out.println("Taksimetre tutarı: "+total);

        }
        else{
            System.out.println("Geçerli bir değer giriniz.");
        }
    }

}
