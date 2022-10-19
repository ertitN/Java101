package Methods;
import java.util.Scanner;

public class CreatingMethodsByPatterns {

    static  int decreaseMethod(int num){

        System.out.print(num+" ");
        if(num<=0){
            return num;
        }
        else{
            num -=5;
            return decreaseMethod(num);
        }

    }

    static int increaseMethod(int num2,int tempNum){

        if(num2==tempNum){
            return num2;
        }
        else{
            num2+=5;
            System.out.print(num2+" ");
           return increaseMethod(num2,tempNum);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı: " );

        int num = input.nextInt();

        int tempNum = num;

        int num2 = decreaseMethod(num);

        increaseMethod(num2,tempNum);






    }
}
