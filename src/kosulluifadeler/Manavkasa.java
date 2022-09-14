package kosulluifadeler;
import java.util.Scanner;
public class Manavkasa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kgPear = 2.14;
        double kgApple = 3.67;
        double kgTomato = 1.11;
        double kgBanana = 0.95;
        double kgAubergine = 5;
        double kg, total = 0;

        System.out.print("Armut kaç kilo?: ");
         kg = inp.nextDouble();
        total += (kgPear*kg);

        System.out.print("Elma kaç kilo?: ");
        kg = inp.nextDouble();
        total += (kgApple*kg);

        System.out.print("Domates kaç kilo?: ");
        kg = inp.nextDouble();
        total += (kgTomato*kg);

        System.out.print("Muz kaç kilo?: ");
        kg = inp.nextDouble();
        total += (kgBanana*kg);

        System.out.print("Patlıcan kaç kilo?: ");
        kg = inp.nextDouble();
        total += (kgAubergine*kg);

        System.out.println("Toplam tutar: "+total+" TL");

    }
}
