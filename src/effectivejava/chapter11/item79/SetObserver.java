package effectivejava.chapter11.item79;

// Set obeserver callback interface - Page 266
public interface SetObserver<E> {
    // Invoked when an element is added to the observable set
    void added(ObservableSet<E> set, E element);
}
