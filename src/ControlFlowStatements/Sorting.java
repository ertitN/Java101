package ControlFlowStatements;

import java.util.Scanner;
public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("İlk sayıyı giriniz.");

        a = input.nextInt();

        System.out.println("İkinci sayıyı giriniz.");
        b = input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz.");

        c = input.nextInt();

        if(a==b && a==c){
            System.out.println("a=b=c");
        }
        else if(a==b){
            if(a<c){
                System.out.println("a=b<c");
            } else{
                System.out.println("c<a=b");
            }

        }

        else if(b==c){
            if(b<a){
            System.out.println("b=c<a");
            } else{
                System.out.println("a<b=c");
            }
        }
        else if(a==c){
            if(a<b){
            System.out.println("a=c<b");
            } else{
                System.out.println("b<a=c");
            }
        }

       else if(a<c && a<b){
            if(b<c){
                System.out.println("a<b<c");
            }
            else{
                System.out.println("a<c<b");
            }
        } else if(b<a && b<c){

            if(a<c){
                System.out.println("b<a<c");
            }
            else{
                System.out.println("b<c<a");
            }
        }
        else if(c<a && c<b){
            if(a<b){
                System.out.println("c<a<b");
            }
            else{
                System.out.println("c<b<a");
            }
        }
    }
}