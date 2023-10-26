package lesson13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        String bye = map.put(2, "Bye");
        System.out.println(bye);
        String goodbye = map.put(2, "Goodbye");
        System.out.println(goodbye);

        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.get(1));

        boolean b = map.containsKey(2);
        System.out.println(map.containsKey(4));
        map.put(4, null);
        System.out.println(map.containsKey(4));
        boolean bye1 = map.containsValue("Bye");
        map.putIfAbsent(2, "Ciao");
        System.out.println(map);
        Set<Integer> integers = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (java.util.Map.Entry<Integer, String> entry :map.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            System.out.println(entry.getValue());
        }

        String str = "sadfusdgfjhadshlkfhsdkugfkudshfkjdgfkjdgfuyerfhjhfgsydukf";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str.toCharArray()) {
//            hashMap.putIfAbsent(c, 0);
//            hashMap.put(c, hashMap.get(c) + 1);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

        }

        System.out.println(hashMap);

        Character ch = null;
        int count = 0;

        for (var entry : hashMap.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                ch = entry.getKey();
            }
        }

        System.out.println(ch + " " + count);

    }
}
