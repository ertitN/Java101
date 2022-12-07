package OtherTopics;
import java.util.Scanner;

public class NumberGuessingGame {

    static boolean isNum(int num){
        Scanner input = new Scanner(System.in);

        int count = 0;
        for(int i = 5;i>0; i--) {
            int predictedNum = input.nextInt();
            count++;
            if(predictedNum<0 || predictedNum>100){
                System.out.println("Geçersiz değer.Tekrar dene.");
                continue;
            }
            if(predictedNum==num){
                System.out.println(count+".denemede buldun.Tebrikler:)");
                return true;
            }
            if(i==1){
                break;
            }
            else{
                System.out.println("Kalan hak: "+(i-1));
                if(num>predictedNum){
                    System.out.println("Daha büyük.");

                    if(num-predictedNum<=5){
                        System.out.println("Çok yaklaştın.");
                    }
                }
                else{
                    System.out.println("Daha küçük.");
                    if(predictedNum-num<=5){
                        System.out.println("Çok yaklaştın.");
                    }
                }
            }
        }
        System.out.println("Hakkın bitti.Kaybettin.");
        return false;
    }

    public static void main(String[] args) {
            int num = (int)(Math.random()*101);
        System.out.println("0-100 arasında bir sayı tuttum.Tahmin et..");
        isNum(num);

    }
}
