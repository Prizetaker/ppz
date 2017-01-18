package dnp.First.Homework;

public class Vectormaster {
	
	public static void main(String[] args) {
		Vector v1 = new Vector(-1, 2, 5);
		Vector v2 = new Vector(2, 4, 7);
		Vector v3 = v1.addVector(v1);
		
		System.out.println(v1 + " + " + v2 + " = " + v3);
		
		double scalarMult = v2.scalarMult(v1,v2);
		
		System.out.println(v1 + " * " + v2 + " = " + scalarMult);
		
		Vector v4 = v2.multVector(v3);
		
		System.out.println(v2 + " x " + v3 + "=" + v4);
	}

}
