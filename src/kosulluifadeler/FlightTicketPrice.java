package kosulluifadeler;
import java.util.Scanner;
public class FlightTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age,travelType;
        double ticketPrice,distance,perKm = 0.10;

        System.out.print("Mesafeyi giriniz: ");

        distance = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");

        age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz:\nTek yön ise 1\nGidiş dönüş ise 2'yi tuşlayın");

        travelType = input.nextInt();
        ticketPrice = distance * perKm;

        if(distance > 0 && age>0 && (travelType ==1 || travelType==2)){

            if(age<12){
                    ticketPrice -= (ticketPrice*0.50);

            }
            else if(age>=12 && age<=24){
                ticketPrice -= (ticketPrice*0.10);

            }
            else{
                ticketPrice -= (ticketPrice*0.30);
            }

            if(travelType==2){
                ticketPrice -= (ticketPrice*0.20);
                ticketPrice *=2;
            }

            System.out.println("Toplam tutar: "+ticketPrice+" TL");

        } else{
            System.out.println("Hatalı veri girdiniz!");
        }





    }
}
