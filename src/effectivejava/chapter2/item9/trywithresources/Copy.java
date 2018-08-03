package effectivejava.chapter2.item9.trywithresources;

import java.io.*;

public class Copy {
    private static final int BUFFER_SIZE = 8 * 1024;

    // try-with-resources on multiple resources - short and sweet (Page 35)
    static void copy(String src, String dst) throws IOException {
        try (InputStream   in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

    public static void main(String[] args) throws IOException {
        String src = args[0];
        String dst = args[1];
        copy(src, dst);
    }
}
