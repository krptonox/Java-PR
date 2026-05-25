public class FactUsingTail {
    static void main(String[] args) {
        int n = 5;
        System.out.println(tailFact(5,1));
    }

    static int tailFact(int n,int ans) {
        if(n==0) return ans;
        return tailFact(n-1, ans* n);
    }
}
