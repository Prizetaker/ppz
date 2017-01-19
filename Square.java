package dnp.Second.Homework;

public class Square extends Shape{
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square() {
    }

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Square{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + '}';
    }

    @Override
    public double getPerimeter() {
        return Point.getGap(a,b) + Point.getGap(b,c) + Point.getGap(c,d) + Point.getGap(d,a);
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter()/2;
        return Math.sqrt((p - Point.getGap(a,b)) * (p - Point.getGap(b,c)) * (p - Point.getGap(c,d)) * (p - Point.getGap(d,a)));
    }
}
