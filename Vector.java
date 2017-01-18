package dnp.First.Homework;

//Описать класс «Vector3d» (т.е. он должен описывать вектор в 3-х мерной,
//декартовой системе координат). В качестве свойств этого класса возьмите
//координаты вектора. Для этого класса реализовать методы сложения, скалярного и
//векторного произведения векторов. Создайте несколько объектов этого класса и
//протестируйте их.

public class Vector {
	private double x, y, z;
	
	
	public Vector(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
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
	
	public double getz() {
		return z;
	}
	
	public void setz(double z) {
		this.z = z;
	}
	
	public Vector addVector(Vector v) {
		
		double a = this.x + v.x;
		double b = this.y + v.y;
		double c = this.z + v.z;
		
		return new Vector(a, b, c);
	}
	
	public double scalarMult(Vector v1, Vector v2) {
		double mult = v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
		
		return mult;
	}
	
	public Vector multVector(Vector v) {
		double a = this.y * v.z - this.z * v.y;
		double b = this.z * v.x - this.x * v.z;
		double c = this.x * v.y - this.y * v.x;
		
		return new Vector(a, b, c);
	}
	
	@Override
	public String toString() {
		return "Vector3D (" +
				"x = " + x +
				", y = " + y +
				", z = " + z +
				')';
	}
	
}
