package patikadevodev;
import java.util.Scanner;
public class FindingZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month,day;
        String warningMessage = "Geçersiz gün bilgisi";

        System.out.print("Doğduğunuz ayı giriniz.");

        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz.");

        day = input.nextInt();



        if(month >= 1 && month<=12){

            if(day>=1 && day<=31 && month == 1){

                if(day<22){
                    System.out.println("Oğlak");
                } else{
                    System.out.println("Kova");
                }
            }
           else if(day>=1 && day <=28 && month==2){

                    if(day<20){
                        System.out.println("Kova");
                    } else {
                        System.out.println("Balık");
                    }
            } else if((day>=1 && day<=31 ) && month == 3) {
                if(day<21){
                    System.out.println("Balık");
                } else{
                    System.out.println("Koç");
                }
            }
            else if((day>=1 && day<=30 ) && month == 4) {
                if(day<21){
                    System.out.println("Koç");
                } else{
                    System.out.println("Boğa");
                }
            }
            else if((day>=1 && day<=31 ) && month == 5) {
                if(day<22){
                    System.out.println("Boğa");
                } else{
                    System.out.println("İkizler");
                }
            }
            else if((day>=1 && day<=30 ) && month == 6) {
                if(day<23){
                    System.out.println("İkizler");
                } else{
                    System.out.println("Yengeç");
                }
            }
            else if((day>=1 && day<=31 ) && month == 7) {
                if(day<23){
                    System.out.println("Yengeç");
                } else{
                    System.out.println("Aslan");
                }
            }
            else if((day>=1 && day<=31 ) && month == 8) {
                if(day<23){
                    System.out.println("Aslan");
                } else{
                    System.out.println("Başak");
                }
            }
            else if((day>=1 && day<=30 ) && month == 9) {
                if(day<23){
                    System.out.println("Başak");
                } else{
                    System.out.println("Terazi");
                }
            }
            else if((day>=1 && day<=31 ) && month == 10) {
                if(day<23){
                    System.out.println("Terazi");
                } else{
                    System.out.println("Akrep");
                }
            }
            else if((day>=1 && day<=30 ) && month == 11) {
                if(day<22){
                    System.out.println("Akrep");
                } else{
                    System.out.println("Yay");
                }
            }
            else if((day>=1 && day<=31 ) && month == 12) {
                if(day<22){
                    System.out.println("Yay");
                } else{
                    System.out.println("Oğlak");
                }
            }
            else{
                System.out.println(warningMessage);
            }

        }

        else{
            System.out.println("Geçersiz ay bilgisi.");
        }


    }
}
