import java.util.*;
public class Kadanes {
    public static void kadan(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<arr.length;i++){
                cs = cs +arr[i];
                if(cs < 0){
                    cs = 0;
                }
                ms = Math.max(cs,ms);
        }
        System.out.println("Maximum Sum is = "+ms);
    }

    public static void main(String[] args){
        int arr[] = {-2,-3,-1,6,9,-2,-3};
        kadan(arr);
    }
}
