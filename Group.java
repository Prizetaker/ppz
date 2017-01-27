package dnp.Fourth.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Group implements Additional, Vnk {
    private int check = 0;
    private Student[] list;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Group() {
        list = new Student[10];
    }

    public Student[] getList() {
        return list;
    }

    public void addSt() throws Except, IOException {
        if (check > 2) throw new Except();
        for (int i=0; i<=list.length-1;i++){
        if (list[i] == null) {
            System.out.print("Input First Name of "+(check+1)+" student - ");
            String name = reader.readLine();
            System.out.print("Input Last Name of "+(check+1)+" student - ");
            String surname = reader.readLine();
            System.out.print("Input Citizenship of "+(check+1)+" student - ");
            String citizenship = reader.readLine();
            System.out.print("Input Faculty of "+(check+1)+" student - ");
            String faculty = reader.readLine();
            System.out.print("Input Age of "+(check+1)+" student - ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Input Course of "+(check+1)+" student - ");
            int course = Integer.parseInt(reader.readLine());
           
            Student st = new Student(name, surname , citizenship, false, age, faculty, course);
            list[i] = st;
            System.out.println(st.toString() + " - added!");
            check++;
        }
    }
}

    public void delStud() {
        System.out.print("Input First Name of Student to delete - ");
        String Fname = null;
        try {
            Fname = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Input Last Name of Student to delete - ");
        String Lname = null;
        try {
            Lname = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int check1 = 0;
        for (int i = 0; i <= 9; i++) {
            if (list[i].getSurname().equalsIgnoreCase(Lname) && list[i].getName().equalsIgnoreCase(Fname)) {
                System.out.println(list[i].toString() + " - deleted!");
                list[i] = null;
                check--;
                check1++;
            }
        }
        if (check1 == 0) System.out.println("No such student in this group");
    }

    public void findStud() {
        System.out.print("Input Last Name of Student to find - ");
        String lastN = null;
        try {
            lastN = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int check = 0;
        for (int i = 0; i <= 9; i++) {
            if (list[i].getSurname().equalsIgnoreCase(lastN)) {
                check++;
                System.out.println(list[i].toString());
            }
        }
        if (check == 0) System.out.println("No such student in this group");
    }

    public void sortSurname(){ 
        Student[] sortList = (list);
        Arrays.sort(sortList);
        
        for(int i = 0; i < sortList.length-1; i++){
            for(int y = i+1; y < sortList.length; y++){
                if(sortList[i]!=null && sortList[y]!=null && sortList[i].getSurname().compareTo(sortList[y].getSurname()) > 0 ){
                    Student buffer = sortList[i];
                    sortList[i] = sortList[y];
                    sortList[y] = buffer;
                    
                    System.out.println(buffer.toString());
                    
                }
            }
        }
        
        
    }

	@Override
	public void voenkom() {
		// TODO Auto-generated method stub
		
	}

        
        
        
