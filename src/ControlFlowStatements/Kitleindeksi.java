package ControlFlowStatements;
import java.util.Scanner;

public class Kitleindeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight;
        double height;
        double index;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = input.nextInt();
        index = weight / (height*height);
        System.out.print("Vücut kitle indeksiniz: "+index);


    }
}
