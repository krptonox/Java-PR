import java.util.*;
public class valid_anagram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.length() != t.length()) {
            System.out.println(true);
        }
        HashMap<Character, Integer> mp1 = makeFreq(s);
        HashMap<Character, Integer> mp2 = makeFreq(t);
        if(mp1.equals(mp2)){
            System.out.println("true");
            System.out.println(mp1.values());
            System.out.println(mp2.values());
        }

    }
    static HashMap<Character,Integer> makeFreq(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }
}
