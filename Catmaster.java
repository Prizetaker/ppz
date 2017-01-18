package dnp.First.Homework;

public class Catmaster {
	public static void main (String[] args) {
	Cat catOne = new Cat("Baksik", "Black", 4.2, 3);
        Cat catTwo = new Cat("Kisa", "White", 3.8, 2);
        Cat catThree = new Cat("Shitter", "Red", 5.1, 4);
	
    System.out.println(catOne);
    catOne.eating();
    catOne.shitting();

    System.out.println(catTwo);
    catTwo.eating();
    catTwo.sleeping();

    System.out.println(catThree);
    catThree.shitting();
    catThree.sleeping();

}


}
