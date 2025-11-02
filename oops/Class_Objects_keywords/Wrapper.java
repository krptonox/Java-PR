public class Wrapper {
    static void main(String args[]) {

        int a = 10;   // Primitive data type
        Integer num = 45;//Object type integer (Wraper Calss)

        A kunal  = new A("rohit");
        System.out.println(kunal.name);
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
}
