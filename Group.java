package dnp.Third.Homework;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private Student[] list = new Student[10];
	private int quant = 0;
	
	public Student[] getList() {
		return list;
	}
	
	public void setList(Student[] list) {
		this.list = list;
	}
	
	public void addSt(Student num) {
		
		try {
			list[quant++] = num;
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			noNum();
		}
		
	}
	
	public void delSt(int quant) {
		if (quant > 0 && quant < 11 && list[quant - 1] != null) {
			list[quant - 1] = null;
		}
		else System.out.println("Deletion is impossible as the object doesn't exist");
	}
	
	public void delSt(Student num) {
		for (int i = 0; i < list.length; i++) {
			if (list [i] == (num) && list[i] != null) {
				list[i] = null;
			}
		}
		
	}
	
	public void checkSt(String Surnames) {
		StringBuilder build = new StringBuilder();
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null && list[i].getSurname().equals(Surnames)) {
			build.append(list[i].getSurname().toString());
			build.append(System.lineSeparator());
			count++;
			}			
			}
		if (count == 0) {
			System.out.println("No such student in the list");
		}
		System.out.println(build.toString());
	}
	
	public void noNum() throws ArrayIndexOutOfBoundsException {
		if (quant > 10) {
			System.out.println("The list contains 10 students allready. This one is one too many.");
		}
	}
	
	
@Override
	
	public String toString() throws NullPointerException {
		Student[] temp;
		temp = Arrays.copyOf(list, list.length);
		Arrays.sort(temp, new Comparator<Student>(){
			@Override
			public int compare(Student num1, Student num2) {
				return (num1.getSurname().compareToIgnoreCase(num2.getSurname()));
			}
		});
		for (int i = 0; i < temp.length; i++) System.out.println((i + 1) + " : " + temp[i].toString());
		return "";
}
}
	
	
