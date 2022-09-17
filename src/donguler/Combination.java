package donguler;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result;


        System.out.println("Hesaplamak istediğiniz kombinasyon sayılarını sırasıyla giriniz.");

            int n = scan.nextInt();

          int diff = n;
        for(int i = n-1; i>=1;i--){
                n *=i;
        }


        int r = scan.nextInt();
        diff -= r;

        for(int i = r-1; i>=1;i--){
            r *=i;
        }

        for(int i = diff-1; i>=1;i--){
            diff *=i;
        }
        result = n/(r*diff);
        System.out.println(result);








    }
}
