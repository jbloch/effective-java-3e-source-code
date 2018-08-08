package effectivejava.chapter6.item40;

import java.util.HashSet;
import java.util.Set;

// Fixed Bigram class (Page 189)
public class Bigram2 {
    private final char first;
    private final char second;

    public Bigram2(char first, char second) {
        this.first  = first;
        this.second = second;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Bigram2))
            return false;
        Bigram2 b = (Bigram2) o;
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram2> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram2(ch, ch));
        System.out.println(s.size());
    }
}
