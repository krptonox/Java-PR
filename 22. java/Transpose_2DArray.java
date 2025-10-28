import java.sql.SQLOutput;

public class Transpose_2DArray {
    static void main() {
        int Arr[][]={{1,2,4,5},{7,8,9,6},{3,11,15,16},{10,12,13,14}};
        Transpose(Arr);
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Transpose(int[][] Arr) {
           for(int i=0;i<Arr.length;i++){
               for(int j=i + 1;j<Arr.length;j++){
                       int temp = Arr[i][j];
                       Arr[i][j] = Arr[j][i];
                       Arr[j][i] = temp;
               }
           }
    }
}
