public class SubString {
    static void main() {
        String s = "hellobye";
        System.out.println(s.substring(2,5));
        System.out.println(s.substring(5,8));
        subString(s);
    }

    public  static void subString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.subSequence(i,j));
            }
        }
    }
}
