package effectivejava.chapter8.item50;
import java.util.*;

// Two attacks on the internals of an "immutable" period (232-3)
public class Attacks {
    public static void main(String[] args) {
        // Attack the internals of a Period instance  (Page 232)
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);  // Modifies internals of p!
        System.out.println(p);

        // Second attack on the internals of a Period instance  (Page 233)
        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78);  // Modifies internals of p!
        System.out.println(p);
    }
}
