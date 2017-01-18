package dnp.First.Homework;

//Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
//Наделить его свойствами и методами. Создать несколько экземпляров объектов этого
//класса. Использовать эти объекты.

public class Cat {
	
	private String name;
    private int age;
    private double weight;
    private String color;
    
    public Cat(String name, String color, double weight, int age) {
    	
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.name = name;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eating() {
		System.out.println("	'purr' \n");
	}
	
	public void sleeping() {
		System.out.println("	'do not disturb' \n");
	}

	public void shitting() {
		System.out.println("	'Servant, change the sand!' \n");
	}

	

	@Override
	public String toString() {
		return name +" [" + color + ", weight=" + weight + ", age=" + age + "]";
	}

}


