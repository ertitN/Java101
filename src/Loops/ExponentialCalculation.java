package Loops;
import java.util.Scanner;

public class ExponentialCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num,power,result = 1;

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
        num = scan.nextInt();

        System.out.print("Sayının kuvvetini giriniz: ");
        power = scan.nextInt();

        for(int i = 1;i<=power;i++){

                result = result * num;
        }

        System.out.println(num+"^"+power+"= "+result);
    }
}
