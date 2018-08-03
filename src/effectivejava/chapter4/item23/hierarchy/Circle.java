package effectivejava.chapter4.item23.hierarchy;

// Class hierarchy replacement for a tagged class  (Page 110-11)
class Circle extends Figure {
    final double radius;

    Circle(double radius) { this.radius = radius; }

    @Override double area() { return Math.PI * (radius * radius); }
}
