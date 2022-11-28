package Arrays;

import java.util.Arrays;

public class RepeatingEvenNumbers {
    static boolean isFind(int[] duplicate,int num){

        for(int i=0;i<duplicate.length;i++){

            if(duplicate[i] == num){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        int[] list = {1,5,2,8,10,12,9,7,7,5,2,8,12,8,};
        int[] duplicate = new int[list.length];

        int starterIndex = 0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<duplicate.length;j++){
                if( i!=j && list[i]%2==0 && list[i]==list[j] && isFind(duplicate,list[i])){
                    duplicate[starterIndex] = list[i];
                    starterIndex++;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));

    }
}
