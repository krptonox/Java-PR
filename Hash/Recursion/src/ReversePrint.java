import java.sql.SQLOutput;

public class ReversePrint {
    static void main(String[] args) {
        int n = 5;
        PD(n);
        PI(n);
    }

    static void PD(int n) {
        if(n==0) return;
        System.out.println(n);
        PD(n-1);

    }

    static void PI(int n) {
        if(n==0) return;
        PI(n-1);
        System.out.println(n);
    }
}
