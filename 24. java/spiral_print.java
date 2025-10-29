public class spiral_print {
    static void main() {
        System.out.println("Spiral Print");

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
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
                for (int i = minc; i <= maxc; i++) {
                    System.out.print(arr[minr][i] + " ");
                }
                minr++;

                for (int i = minr; i <= maxr; i++) {
                    System.out.print(arr[i][maxc] + " ");
                }
                maxc--;


                for (int i = maxc; i >= minc; i--) {
                    System.out.print(arr[maxr][i] + " ");
                }
                maxr--;


                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                }
                minc++;

        }
    }
}
