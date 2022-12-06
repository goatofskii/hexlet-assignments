package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] string = sentence.split(" ");

        Map<String, Integer> stringMap = new HashMap<>();

        for (int i = 0; i < string.length; i++) {
            stringMap.put(string[i], 0);
        }

        for (int i = 0; i < string.length; i++) {
            for (String test : stringMap.keySet()) {
                if (test.equals(string[i])) {
                    stringMap.put(test, stringMap.get(test) + 1);
                }
            }

        }
        return stringMap;
    }

    public static String toString(Map<String, Integer> map) {

        if (map.isEmpty()) {
            return ("{}");
        }

        StringBuilder stringBuilder = new StringBuilder("{\n");

        for (Map.Entry map2 : map.entrySet()) {
            stringBuilder.append("  " + map2.getKey() + ": " + map2.getValue() + "\n");
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
//END
