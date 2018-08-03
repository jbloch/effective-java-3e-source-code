package effectivejava.chapter7.item43;

import java.util.Map;
import java.util.TreeMap;

// p. 197
public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> frequencyTable = new TreeMap<>();
        for (String s : args) {
//          map.merge(key, 1, (count, incr) -> count + incr);
            frequencyTable.merge(s, 1, Integer::sum);
        }

        System.out.println(frequencyTable);
    }
}
