import java.util.*;
public class hashset {
    static void main(String args[]) {
        //cretring
        HashSet<Integer> set = new HashSet<>();
        int nums[] = {5,2,1,2,5,2,1,2,5};

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);


        //serch - contains
        if(set.contains(1)){
            System.out.println("yes");
        }
        if(!set.contains(6)){
            System.out.println("no");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Deleted");
        }

        //Size of set
        System.out.println(set.size());

        //set elements printing
        System.out.println(set);

        //Itereartor
         Iterator  it = set.iterator();

         // hasNext function
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        return 0;
    }
}
