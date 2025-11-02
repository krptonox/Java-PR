public class String_Lexicography {
    static void main() {
        String s1 = "Komal";
        String s2 = "Kunal";
        System.out.println(s1.compareTo(s2));
        System.out.println(comapreTo(s1,s2));
    }
    public static int comapreTo(String s1, String s2){
        if(s1 == s2) {
            return 0;
        }
        int len = Math.min(s1.length(),s2.length());
        for(int i=0;i<len;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
