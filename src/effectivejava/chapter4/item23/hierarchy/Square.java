package effectivejava.chapter4.item23.hierarchy;

// Class hierarchy replacement for a tagged class  (Page 110-11)
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}
