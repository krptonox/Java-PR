import java.util.*;
public class hashMap {
    static void main(String args[]) {
     HashMap<String, Integer> map  = new HashMap<>();
     map.put("kunal",89);
     map.put("kai",99);
     map.put("lee",84);

        System.out.println(map.get("kai"));
        System.out.println(map.getOrDefault("hgi",0));
        System.out.println(map.containsKey("kai"));

        HashSet<Integer> set = new HashSet<>();

        set.add(78);
        set.add(90);
        set.add(78);

        System.out.println(set);
    }
}
