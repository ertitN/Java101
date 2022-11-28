package Arrays;
import java.util.Scanner;

public class SortingNumbers {
    static int[] itemsOfArray(int[] arr){
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.print((i+1)+". elemanı: ");
            arr[i] = input.nextInt();
        }
        return arr;

    }

    static void sortArray(int[] arr){
        int num;
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num; 
                }
            }
        }
    }

    static void printArray(int[] arr){

        System.out.print("Sıralama: ");
        for(int i:arr){
            System.out.print(i+" ");
        }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        sortArray(itemsOfArray(arr));
        printArray(arr);
    }
}
