public class help_student {
    static void main(String args[]) {
        int[] arr ={4,7,3,90,112,34};
        int n = arr.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int smaller = -1;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    smaller = arr[j];
                    break;
                }
            }
            result[i] = smaller;
        }
    }
}
