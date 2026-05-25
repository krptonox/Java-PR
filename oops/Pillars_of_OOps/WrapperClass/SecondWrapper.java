package WrapperClass;

public class SecondWrapper {
    static void main(String[] args) {
        String price1 = "463";
        String price2 = "237";

        int p1 = Integer.parseInt(price1);
        int p2 = Integer.parseInt(price2);
        System.out.println(p1 + p1);

        int a = 10;          // primitive
        Integer b = 20;      // wrapper

        Integer c = a;       // auto-boxing
        int d = b;           // auto-unboxing

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
