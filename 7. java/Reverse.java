public class Reverse {
    public static void reverse(int arr[]){
        int frst = 0,last = arr.length-1;
        while(frst<last){
            int temp = arr[last];
            arr[last] = arr[frst];
            arr[frst] = temp;
            frst++;
            last--;
        }
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
