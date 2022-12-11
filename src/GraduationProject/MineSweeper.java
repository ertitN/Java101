package GraduationProject;

import java.util.Scanner;

public class MineSweeper {
        int rowNumber;
        int colNumber;
        int amountOfMine;
       int[][] map;

    public MineSweeper(int rowNumber,int colNumber) {
        System.out.println("Mayın tarlası oyununa hoşgeldiniz!");
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        amountOfMine = (this.rowNumber * this.colNumber) / 4; // Oyun haritasına rastgele atılan mayın sayısı
         map = new int[this.rowNumber][this.colNumber]; // Harita büyüklüğü

        }
        void placeRandomMines(){

            int randomCol;
            int randomRow;

            int i = 0;
            while (i < amountOfMine) {
                randomCol = (int) (Math.random() * colNumber);
                randomRow = (int) (Math.random() * rowNumber);
                if (map[randomRow][randomCol] == -1) {
                    continue;
                } else {
                    map[randomRow][randomCol] = -1;
                }
                i++;
            }
        }

        void printGameMap(){
            for (int j = 0; j < map.length ; j++) {
                for (int k = 0; k < map[j].length; k++) {
                    if(map[j][k]>=0){

                        System.out.print(" "+map[j][k]+" ");
                    }
                    else{

                        System.out.print(" _ ");
                    }
                }
                System.out.println();
            }
            System.out.println("===========");
        }

        void printPlacementOfMines(){
            System.out.println("Kaybettin.");
            System.out.println("Mayının konumları");
            for (int row[] : map) {
                for (int col : row) {
                    if (col == -1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }

    void run() {
        Scanner scan = new Scanner(System.in);

        placeRandomMines();

          // Mayın olmayan matrislere -5 değeri atandı.
        for (int j = 0; j < map.length; j++) {
            for (int k = 0; k < map[j].length; k++) {
                   if(map[j][k]!=-1){
                       map[j][k] = -5;
                   }
            }
        }

        int inpCol;
        int inpRow;

        int count = 0;
        while(count!=(rowNumber*colNumber)-amountOfMine){

            printGameMap();

            count++;
            System.out.print("Satır giriniz: ");
            inpRow = scan.nextInt();
            System.out.print("Sütun giriniz: ");
            inpCol = scan.nextInt();

            inpCol = inpCol -1;
            inpRow = inpRow -1;

            if(inpRow>=map.length || inpCol>=map[0].length || inpRow<0 ||inpCol<0 || map[inpRow][inpCol]>=0){
                System.out.println("Geçersiz değer.Tekrar deneyiniz.");
                continue;
            }

            if(map[inpRow][inpCol]==-5){
                map[inpRow][inpCol] = 0;

                // Girilen matrisin sağ,sol,yukarı,alt ve çaprazlarındaki matrislerde mayın olup olmadığı kontrol edildi.

                if(inpCol-1>=0 && map[inpRow][inpCol-1]==-1) {
                    map[inpRow][inpCol]++;
                }

                if(inpCol+1<map[0].length && map[inpRow][inpCol+1]==-1){
                    map[inpRow][inpCol]++;
                }
                if(inpRow-1>=0 && map[inpRow-1][inpCol]==-1){
                    map[inpRow][inpCol]++;

                }
                if(inpRow+1<map.length && map[inpRow+1][inpCol]==-1){
                    map[inpRow][inpCol]++;

                }
                if(inpRow+1<map.length && inpCol+1<map[0].length && map[inpRow+1][inpCol+1]==-1){
                    map[inpRow][inpCol]++;

                }
                if(inpRow+1<map.length && inpCol-1>=0 && map[inpRow+1][inpCol-1]==-1){
                    map[inpRow][inpCol]++;

                }

                if(inpRow-1>=0 && inpCol+1<map[0].length && map[inpRow-1][inpCol+1]==-1){
                    map[inpRow][inpCol]++;
                }
                if(inpRow-1>=0 && inpCol-1>=0 && map[inpRow-1][inpCol-1]==-1){
                    map[inpRow][inpCol]++;
                }

            }
            else{
                printPlacementOfMines();
                break;
            }
        }
        if(count==(rowNumber*colNumber)-amountOfMine){
            System.out.println("Oyunu kazandınız !");

        }

    }
}





