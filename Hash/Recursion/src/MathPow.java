public class MathPow {
    static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println(Pow(a,b));
    }

    static int Pow(int a, int b) {
        if(b==0){
            return 1;
        }
        int ans = Pow(a,b-1);
        return ans*a;
    }
}
