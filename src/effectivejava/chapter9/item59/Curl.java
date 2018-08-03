package effectivejava.chapter9.item59;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

// Printing the contents of a URL with transferTo, added in Java 9 (Page 269)
public class Curl {
    public static void main(String[] args) throws IOException {
        try (InputStream in = new URL(args[0]).openStream()) {
            in.transferTo(System.out);
        }
    }
}
