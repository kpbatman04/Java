package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class testingMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("krish",95);
        map.put("prish",92);
        map.put("srish",90);
        map.put("arish",35);
        map.put("erish",36);
        System.out.println(map.get("krish"));
        System.out.println(map.size());
        System.out.println(map.containsKey("erish"));
        System.out.println(map.remove("arish"));
        System.out.println(map.get("arish"));
        for (String s : map.keySet()) {
            System.out.printf("%s : %s\n",s,map.get(s));
        }
    }
}
