public class BubbleSorting {
    public static int buuble(int arr[]){
        int n = arr.length;
        for(int i=0;i<arr.length-1;i++){
            int swaps = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0){
                return n;
            }
        }
        return -1;
    }

    public static void  main(String args[]){
      int arr[] = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After Change");
        int s = buuble(arr);
        System.out.println("If array is alredy sorted "+s);

        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }

    }
}
