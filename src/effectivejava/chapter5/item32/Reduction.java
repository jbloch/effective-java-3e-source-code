package effectivejava.chapter5.item32;
import java.util.*;

// List-based generic reduction with wildcard type - Page 136
public class Reduction {
    // Wildcard type for parameter that serves as an E producer
    static <E> E reduce(List<? extends E> list, Function<E> f,
                        E initVal) {
        List<E> snapshot;
        synchronized(list) {
            snapshot = new ArrayList<E>(list);
        }
        E result = initVal;
        for (E e : snapshot)
            result = f.apply(result, e);
        return result;
    }

    private static final Function<Number> MAX = new Function<Number>(){
        public Number apply(Number n1, Number n2) {
            return Double.compare(n1.doubleValue(), n2.doubleValue()) > 0 ?
                   n1 : n2;
        }
    };

    public static void main(String[] args) {
        // We can use a Number functionto reduce a list of Integer or Double
        List<Integer> intList = Arrays.asList(
            2, 7, 1, 8, 2, 8, 1, 8, 2, 8);
        System.out.println(reduce(intList, MAX, Integer.MIN_VALUE));

        List<Double> doubleList = Arrays.asList(
            2.718281828, 3.141592654, 1.61803399);
        System.out.println(reduce(doubleList, MAX, Double.NEGATIVE_INFINITY));
    }
}
