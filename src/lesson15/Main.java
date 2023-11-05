package lesson15;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>(map);
    }
}
