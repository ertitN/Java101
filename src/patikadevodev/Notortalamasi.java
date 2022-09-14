package patikadevodev;
import java.util.Scanner;

public class Notortalamasi {
    public static void main(String[] args) {

        /* ÖDEV
        Sınıf geçme durumunu hesaplayınız. Geçme Notu: 55
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */


        int mat,turkce,kimya,muzik,fizik;
        double notortalamasi = 0;
        int counter = 0; // Sadece 0 ile 100 arasında olan notları ortalamaya dahil etmek için oluşturduğum değişken.

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if(mat>=0 && mat<=100){
            notortalamasi += mat;
            counter++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        if(turkce >= 0 && turkce <= 100){
            notortalamasi += turkce;
            counter++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        if(kimya>=0 && kimya<=100){
            notortalamasi += kimya;
            counter++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        
        if(fizik>=0 && fizik<=100){
            notortalamasi += fizik;
            counter++;
        }


        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if(muzik>=0 && muzik<=100){
            notortalamasi += muzik;
            counter++;
        }

        notortalamasi /= counter;

        if(notortalamasi >= 55){
            System.out.println("Ortalamanız: "+notortalamasi+"\nTebrikler. Sınıfı geçtiniz");
        } else{
            System.out.println("Ortalamanız: "+notortalamasi+"\nSınıfta kaldınız.");
        }

    }
}
