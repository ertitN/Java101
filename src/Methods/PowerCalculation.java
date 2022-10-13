package Methods;
import java.util.Scanner;

public class PowerCalculation {

    static int power(int a, int b){


         if(a==0){
             return 0;
         }
       else if(b==0){
            return 1;
        }
        else{
            return a * power(a,(b-1));
        }


    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç adet işlem yapacağınızı giriniz.");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){

        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exp = input.nextInt();

        int result = power(base,exp);

        System.out.println("Sonuç: "+result);
        }
    }
}
