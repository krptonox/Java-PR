public class Time_space {
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        for(int i=0;i<100000;i++){

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(start);
        System.out.println(end);

        System.out.println("hello");//O(1)
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }
}
