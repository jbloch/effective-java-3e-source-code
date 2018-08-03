package effectivejava.chapter8.item52;
import java.util.*;
import java.math.*;

// Broken! - What does this program print?  (Page 238)
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections)
            System.out.println(classify(c));
    }
       // Repaired  static classifier method. (Page 240)
//    public static String classify(Collection<?> c) {
//        return c instanceof Set  ? "Set" :
//                c instanceof List ? "List" : "Unknown Collection";
//    }
}
