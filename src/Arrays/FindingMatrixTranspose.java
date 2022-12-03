package Arrays;
import java.util.Scanner;
public class FindingMatrixTranspose {

static void printArray(int[][] arr){

    for(int i[]:arr){
        for(int k:i){
            System.out.print(k+" ");
        }
        System.out.println();
    }
    }

static void assignArrayItems(int[][] arr){

    Scanner scan = new Scanner(System.in);
    System.out.println("Dizinin elemanlarını giriniz.");
    for(int i=0;i<arr.length;i++){
        for (int j=0;j<arr[i].length;j++){
            System.out.print((i+1)+". "+(j+1)+".sütun elemanını giriniz: ");
            int n = scan.nextInt();
            arr[i][j] = n;
        }
    }

}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin satır sayısını giriniz.");
        int row = input.nextInt();
        System.out.println("Dizinin sütun sayısını giriniz.");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];

        assignArrayItems(matrix);

        int[][] transposeMatrix = new int[col][row];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matris: ");
        printArray(matrix);

        System.out.println("Transpoze: ");
        printArray(transposeMatrix);


    }
}