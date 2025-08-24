import java.util.Scanner;

public class swaping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a = b;
        b = c;
         a = a + b;
         b = a - b;
         a = a - b;
         if(a>b && a>c){
             System.out.println("a");
         }
         else if(b>a && b>c){
             System.out.println("b");
         }
         else{
             System.out.println("c");
         }
        System.out.println(a+" "+b);

         if((a%4==0 && a%100!=0) || a%400==0) {
             System.out.println("Is a leap year");
         }
         else{
             System.out.println("Is not  a leap year");
         }

       System.out.println(a & 1);
    }
}
