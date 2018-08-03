package effectivejava.chapter2.item8;

import java.util.concurrent.TimeUnit;

// Ill-behaved client of resource with cleaner safety-net (Page 33)
public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace out");

        // Uncomment next line and retest behavior, but note that you MUST NOT depend on this behavior!
//      System.gc();
    }
}
