import java.util.*;
public class maximum_product_subarray {
    static void main(String[] args) {
        int[] nums = new int[]{-4,-3};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int pr = 1;
        int max = 0;
        int max1 = 0;
        int finMax = 0;
        int mul = 0;

        for(int i=0;i<nums.length - 1;i++){
            max1=Math.max(nums[i],nums[i + 1]);
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length - 1;j++){
                max = nums[i]*nums[j];
                max1 =  Math.max(max,max1);
                System.out.println(max1);
            }
        }

        finMax = Math.max(max,max1);
        return finMax;
    }
}
