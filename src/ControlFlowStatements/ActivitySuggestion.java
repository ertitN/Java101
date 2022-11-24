package ControlFlowStatements;
import java.util.Scanner;
public class ActivitySuggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz. ");
        int temp = input.nextInt();
        System.out.println("Sıcaklık: "+temp+"C\nYapılacak etkinlikler:");

        if(temp<5){
            System.out.println("*Kayak");
        } else if(temp>=5 && temp<=15){
            System.out.println("*Sinema");
        }

        if(temp>=10 && temp<=25){
            System.out.println("*Piknik");
        } else if(temp>25){
            System.out.println("*Yüzme");
        }

    }
}
