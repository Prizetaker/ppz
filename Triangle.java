package dnp.First.Homework;

//Описать класс «Triangle». В качестве свойств возьмите длины сторон
//треугольника. Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.

public class Triangle {
	private double a, b, c; // sides
	
	public Triangle(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double getSide1() {
		return a;
	}
	
	public void setSide1(double a) {
		this.a = a;
	}
	
	public double getSide2() {
		return b;
	}
	
	public void setSide2(double b) {
		this.b = b;
	}
	
	public double getSide3() {
		return c;
	}
	
	public void setSide3(double c) {
		this.c = c;
	}
	
	double area() {
		double s = (a + b + c) / 2.00; // half perimeter;
		if ((a + b > c) && (a + c > b) & (b + c > a)) {
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // heron area
		return area;
		} else System.out.print("It is not a triangle ");
		return 0;
	}

}
