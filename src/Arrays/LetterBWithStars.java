package Arrays;
public class LetterBWithStars {

    public static void main(String[] args) {
      String[][] array = new String[10][6];

      double median = Math.floor(array.length/2.0);

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(j==0 || j==array[i].length-1){
                    array[i][j] = " * ";

                }
                else if(i==0 || i==median || i==array.length-1){
                    array[i][j] = " * ";
                }
                else{
                    array[i][j] = "   ";
                }
            }
        }

        for(String[] row:array){
            for(String col:row){
                System.out.print(col);
            }
            System.out.println();
        }


    }
}













