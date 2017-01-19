package dnp.Second.Homework;

class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle () {
		super();
		
	}
	
	public Triangle(Point a, Point b, Point c) {
		super ();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public double getPerimeter() {
	        return Point.getGap(a, b) + Point.getGap(a, c) + Point.getGap(c, b);
	    }
	
	@Override
	public double getArea() {
		 double p = this.getPerimeter()/2.0;
				 // heron area
				return Math.sqrt(p * (p - Point.getGap(a,b)) * (p - Point.getGap(b,c)) * (p - Point.getGap(c,a)));
				        
	}
	
	@Override
	public String toString() {
		return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
	}

}
