package dnp.Second.Homework;

public class Circle extends Shape {
    private Point o;
    private Point a;

    public Circle() {
    }

    public Circle(Point o, Point r) {
        this.o = o;
        this.a = r;
    }

    public Point geto() {
        return o;
    }

    public void seto(Point o) {
        this.o = o;
    }

    public Point getr() {
        return a;
    }

    public void setr(Point a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Circle{" + "o=" + o + ", a=" + a + '}';
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Point.getGap(o,a);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow( Point.getGap(o,a), 2);
    }

}
