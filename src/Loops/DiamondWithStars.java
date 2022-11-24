package Loops;

public class DiamondWithStars {
    public static void main(String[] args) {

        int n = 6;
        int sum = -1;

        for(int i =1;i<=n;i++){
           sum +=2 ;

            for(int k =1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=sum;j++){
                System.out.print("*");
            }
            System.out.println("");

            }
        for(int i=1;i<=n;i++){
            sum -= 2;


            for(int k=1;k<=i;k++){
                System.out.print(" ");

            }

            for(int j= sum;j>=1;j--){

                System.out.print("*");
            }


            System.out.println("");
        }
        }
    }

