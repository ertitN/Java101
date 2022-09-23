
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ebob ve Ekok'unu hesaplamak istediğiniz iki sayıyı giriniz.");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ebob,ekok;

        int i = num1;


        if(num1>0 && num2>0){

        while(true){

            if(num1%i==0 && num2%i==0){
                ebob = i;
                ekok = (num1*num2)/ebob;
                break;
            }
                i--;
        }
            System.out.println("EBOB: "+ebob+"\n" +
                                "EKOK: "+ekok);
        }
        else{
            System.out.println("Lütfen geçerli bir değer giriniz.");
        }


    }
}
