package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapMain {

    public static void main(String[] args) {
        String str = "sadfusdgfjhadsssshlkfhddsdkugfkudshfkjdgfkjdgfuyerfhjhfgsydukf";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(hashMap);

        List<Character> result = new ArrayList<>();
        int maxCount = 0;

        for (var entry : hashMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result.clear();
                result.add(entry.getKey());
            } else if (entry.getValue() == maxCount){
                result.add(entry.getKey());
            }
        }

        //System.out.println(ch + " " + count);
        System.out.println(result);

    }
}
