package dnp.Second.Homework;

public class Point {
	double x;
	double y;
	
	public Point (double x, double y) {
		super();
		this.x = x;
		this.y = y;
		
	}

	public Point() {
		super();
	}
	
	
	 public double getx() {
	        return x;
	    }

	    public void setx(double x) {
	        this.x = x;
	    }

	    public double gety() {
	        return y;
	    }

	    public void sety(double y) {
	        this.y = y;
	    }

	@Override
	public String toString() {
		
		return " Point (x=" + x + ", y=" + y + ")";
	}
	
	public static double getGap(Point a, Point b) {
		return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
	}
	
}
