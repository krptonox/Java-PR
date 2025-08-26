public class linear_search {
    public static int linear(int num[],int key){
           for(int i=0;i<num.length;i++){
               if(num[i]==key){
                   return i;
               }
           }
           return -1;
    }

    public  static void main(String[] args){
        int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,10,1,2,4};
        int key = 10;
        int ans = linear(num,key);
        System.out.print(ans);
    }
}