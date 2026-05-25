import java.util.*;
public class Array2D {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world");
        int[] arr = new int[5]; //1-D Array
        int[][] Arr ={{1,2,3,4},{3,4,5,6},{7,8,9,10}};
//        System.out.println(Arr); //givse [[I@275675f4
//        int[][] other = Arr;
//        System.out.println(other);
//        System.out.println(Arr.length);  // Row Length
//        System.out.println(Arr[0].length); // column length
//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        int Arr1[][] = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                Arr1[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(Arr1[i][j]+" ");
//            }
//            System.out.println();
//        }

  int sum = 0;
  for(int i=0;i<3;i++){
      for(int j=0;j<4;j++){
          sum = sum + Arr[i][j];
      }
  }
  System.out.println(sum);

  int sum1 = 0;
  for(int i=0;i<3;i++){

  }


    }
}

