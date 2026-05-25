public class String_Demo {
    static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);

        int[] arr = new int[7];
        System.out.println(arr.length);

        System.out.println(s1.length());
    }
}
