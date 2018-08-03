package effectivejava.chapter5.item32;

// Generic Function interface - Page 122
interface Function<T> {
    T apply(T arg1, T arg2);
}
