public class spiral_for_3X4_matrix {
    static void main() {
        System.out.println("Spiral Print for 3X4 Matrix");

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiral(arr);
    }

    public static void spiral(int arr[][]){
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int total_ele = maxr * maxc;
        int count = 0;

        while(minr <= maxr && minc <= maxc) {
            if(minr <= maxr) {
                for (int i = minc; i <= maxc; i++) {
                    System.out.print(arr[minr][i] + " ");
                }
                minr++;
            }

            if(minc <= maxc) {
                for (int i = minr; i <= maxr; i++) {
                    System.out.print(arr[i][maxc] + " ");
                }
                maxc--;
            }


            if(minr <= maxr) {
                for (int i = maxc; i >= minc; i--) {
                    System.out.print(arr[maxr][i] + " ");
                }
                maxr--;
            }


            if(minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                }
                minc++;
            }

        }
    }
}
