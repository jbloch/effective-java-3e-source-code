package effectivejava.chapter11.item81;
import java.util.concurrent.*;

// Concurrent canonicalizing map atop ConcurrentMap - Pages 273-274
public class Intern {
    // Concurrent canonicalizing map atop ConcurrentMap - not optimal
    private static final ConcurrentMap<String, String> map =
            new ConcurrentHashMap<>();

//    public static String intern(String s) {
//        String previousValue = map.putIfAbsent(s, s);
//        return previousValue == null ? s : previousValue;
//    }

    // Concurrent canonicalizing map atop ConcurrentMap - faster!
    public static String intern(String s) {
        String result = map.get(s);
        if (result == null) {
            result = map.putIfAbsent(s, s);
            if (result == null)
                result = s;
        }
        return result;
    }
}