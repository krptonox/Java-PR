public class prifixsum {
    public static void prsum(int arr[]) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                currsum = i==0 ?prefix[j]: prefix[j]-prefix[i-1];
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("MAX Sum = "+maxsum);
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        prsum(arr);
    }
}

