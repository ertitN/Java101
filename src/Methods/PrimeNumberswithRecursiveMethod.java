package Methods;
import java.util.Scanner;

public class PrimeNumberswithRecursiveMethod {

    static void recursiveMethod(int n, int i){

        if(n == i){
            System.out.println(n+" ASALDIR !");
            return;
        }

        else if (n%i==0 || n==1){
            System.out.println(n+ " ASAL DEĞİLDİR !");
            return;
        }

        recursiveMethod(n,i+1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        int i = 2;

        recursiveMethod(n,i);


    }
}
