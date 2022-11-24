package Loops;
import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Basamak sayısını giriniz.");

        digit = input.nextInt();



        for(int i=digit;i>=1;i--){

                for(int k=i;k<=digit;k++){
                    System.out.print(" ");
                }

             for(int j=1;j<=(i*2)-1;j++){

                 System.out.print("*");
             }

            System.out.println("");

        }


    }
}
