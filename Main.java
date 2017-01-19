package dnp.Second.Homework;

public class Main {

    public static void main(String[] args){

        Shape triangle = new Triangle( new Point(1,1), new Point(1,6), new Point(4,1) );
        System.out.println(triangle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        System.out.println();

        Shape circle = new Circle( new Point(1,1), new Point(5,2));
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println();

        Shape square = new Square( new Point(1,1), new Point(4,1), new Point(4,4), new Point(1,4));
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        System.out.println();

        Board board = new Board();
        board.addShape(triangle, 1);
        board.addShape(triangle, 1); //no free place
        board.addShape(triangle, 5); //no such part
        board.addShape(circle, 2);
        board.addShape(square, 3);
        board.addShape(square);
        board.addShape(square); //no place
        board.delShape(5); //no such part
        board.delShape(3);
        board.addShape(triangle, 3);

        System.out.println();

        board.stuff();
    }

}
