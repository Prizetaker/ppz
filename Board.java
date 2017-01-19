package dnp.Second.Homework;

public class Board {
    private Shape[] parts = new Shape[4];

    public Board() {
    }

    public Shape[] getParts() {
        return parts;
    }

    public void addShape(Shape shape, int part){ // puts a shape to a certain part 1,2,3 or 4
        if (part > 0 && part < 5) {
            if (parts[part - 1] == null) {
                parts[part - 1] = shape;
                System.out.println("Please place to the " + (part) + " a shape " + shape);
            }
            else System.out.println("You can not put any shape as the part is used already");
        }
        else System.out.println("Enter a correct number of the board part 1, 2, 3 or 4");
    }

    public void addShape(Shape shape){ // adds a shape to any free place
        boolean add = false;
        for(int i = 0; i < parts.length; i++){
            if(parts[i] == null) {
                parts[i] = shape;
                add = true;
                System.out.println("Shape is on the board " + shape);
                break;
            }
        }
        if (!add) System.out.println("No free place. Delete something.");
    }

    public void delShape(int part){ // Deletes shape from a certain part
        if (part > 0 && part < 5) {
            if (parts[part - 1] != null) {
                parts[part - 1] = null;
                System.out.println("Board part № " + (part) + " is free.");
            }
            else System.out.println("Nothing to delete in that part.");
        }
        else System.out.println("Enter a correct number of the board part 1, 2, 3 or 4");
    }


    public void stuff() {
        double p = 0;
        for (int i = 0; i < parts.length; i++){
            if(parts[i]!=null){
                p += parts[i].getArea();
                System.out.println("Board part № " + (i+1) + " has shape: " + parts[i]);
            }
            else System.out.println("Board part № " + (i+1) + "is empty.");
        }
        System.out.println();
        System.out.println("Total area of shapes on the board is " + p);
    }
}
