package effectivejava.chapter3.item14;

import java.util.*;

// Single-field Comparable with object reference field  (Page 69)
public final class CaseInsensitiveString
        implements Comparable<CaseInsensitiveString> {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // Fixed equals method (Page 40)
    @Override public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    @Override public int hashCode() {
        return s.hashCode();
    }

    @Override public String toString() {
        return s;
    }

    // Using an existing comparator to make a class comparable
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }

    public static void main(String[] args) {
        Set<CaseInsensitiveString> s = new TreeSet<>();
        for (String arg : args)
            s.add(new CaseInsensitiveString(arg));
        System.out.println(s);
    }
}