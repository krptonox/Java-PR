public class Check_Palindrome {
    static void main() {
        String s = "BOB";
        System.out.println(IsPalindrome(s));
    }
    public static Boolean IsPalindrome(String s){
        int i=0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
