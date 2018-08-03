package effectivejava.chapter7.item45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.*;

// Page 210, 211
public class Freq {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);

        // Uses the streams API but not the paradigm--Don't do this!
//        Map<String, Long> freq = new HashMap<>();
//        try (Stream<String> words = new Scanner(file).tokens()) {
//            words.forEach(word -> {
//                freq.merge(word.toLowerCase(), 1L, Long::sum);
//            });
//        }

        // Proper use of streams to initialize a frequency table
        Map<String, Long> freq;
        try (Stream<String> words = new Scanner(file).tokens()) {
            freq = words
                    .collect(groupingBy(String::toLowerCase, counting()));
        }

        System.out.println(freq);

        // Pipeline to get a top-ten list of words from a frequency table
        List<String> topTen = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());

        System.out.println(topTen);
    }
}
