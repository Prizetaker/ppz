package dnp.Third.Homework;

public class Student extends Being {
	private String faculty;
	private int course;
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public int getCourse() {
		return course;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
	public Student(String name, String surname, String citizenship, boolean sex, int age, String faculty, int course) {
	super(name, surname, citizenship, sex, age);
	this.faculty = faculty;
	this.course = course;
	}
	
	@Override
	public String toString() {
		return "Студент{" +
				"факультет - '" + this.getFaculty() + '\'' +
				", курс - '" + this.getCourse() + '\'' +
				super.getName().toString() + '\'' +
				super.getSurname().toString() + '\'' +
				"гражданство - '" + super.getCitizenship().toString() + '\'' +
				"пол - '" + super.getSex() +
				'}';
	}
	
	public Student() {
		
	}
}
