package dnp.First.Homework;

public class TriangleMaster {
	
	public static void main (String[] args) {
		Triangle first = new Triangle(10, 12, 15);
		System.out.println("Area of the triangle having sides " + first.getSide1() + ", " + first.getSide2() + ", " + first.getSide3() + " is ");
		System.out.println(first.area() + "\n");
		
		Triangle second = new Triangle(1, 0, 3);
		System.out.println("Area of the triangle having sides " + second.getSide1() + ", " + second.getSide2() + ", " + second.getSide3() + " is ");
		System.out.println(second.area() + "\n");
		
		Triangle third = new Triangle(12, 16, 20);
		System.out.println("Area of the triangle having sides " + third.getSide1() + ", " + third.getSide2() + ", " + third.getSide3() + " is ");
		System.out.println(third.area() + "\n");
		
	
}

}
