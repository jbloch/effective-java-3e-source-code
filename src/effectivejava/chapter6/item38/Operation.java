package effectivejava.chapter6.item38;

// Emulated extensible enum using an interface  (Page 174)
public interface Operation {
    double apply(double x, double y);
}
