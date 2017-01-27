package dnp.Fourth.Homework;

public class Student extends Being implements Comparable, Vnk {
	private String faculty;
	private int course;
	
public Student() {
		
	}

	public Student(String name, String surname, String citizenship, boolean sex, int age, String faculty, int course) {
	super(name, surname, citizenship, sex, age);
	this.faculty = faculty;
	this.course = course;
	}
	

	
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
	
	 @Override
	    public int compareTo(Object o) {
	        if (o == null) {
	            return -1;
	        }
	        Being anotherBeing = (Being) o;
	        return this.getSurname().compareToIgnoreCase(anotherBeing.getSurname());
	    }

	    @Override
	    public void voenkom() {
	        System.out.println("new message from Voencom:"+ this.getSurname());
	       
	    }

	   
