public class Binary_search_in_2DArray {
    public Binary_search_in_2DArray(int[][] arr, int target) {
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 13;
        Binary_search_in_2DArray ans = new Binary_search_in_2DArray(arr,target);
    }

    static boolean Binary_search(int arr[][], int target) {
        int r = 0;
        int c = arr[0].length - 1;
        while ((r < arr.length) && (c >= 0)) {
            if (arr[r][c] == target) {
                return true;
            } else if (arr[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;

    }
}
