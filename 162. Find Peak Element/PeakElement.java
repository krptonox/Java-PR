import java.util.*;

public class PeakElement {
    static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.print(BinarySearch(nums));
    }

    static int BinarySearch(int[] nums) {
      int start = 0;
      int end = nums.length - 1;
      while(start<end){
          int mid = (start + end)/2;
          if(nums[mid]>nums[start] && nums[mid]>nums[end]){
              return mid + 1;
          }
          else if(nums[mid]<nums[start]){
              end = mid-1;
          }
          else{
              start = mid+1;
          }
      }
      return 0;
    }
}
