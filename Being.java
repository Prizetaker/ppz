package dnp.Third.Homework;

public class Being {
	
	private String name;
	private String surname;
	private String citizenship;
	private boolean sex;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getCitizenship() {
		return citizenship;
	}
	
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	
	public boolean getSex() {
		return sex;
	}
	
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public Being(String name, String surname, String citizenship, boolean sex, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.citizenship = citizenship;
		this.sex = sex;
		this.age = age;
	}
	
public Being() {
		
	}
	
@Override
public String toString() {
	return "Человек(" +
			"имя - " + name + '\'' +
			", фамилия - " + surname + '\'' +
			", гражданство - " + citizenship + '\'' +
			", пол - " + sex + '\'' +
			", возраст - " + age + '\'' +
			')';

}

}
