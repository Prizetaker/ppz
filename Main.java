package dnp.Fourth.Homework;

import java.io.IOException;




public class Main {
    public static void main(String[] args) {
        Group grp = new Group();
        while (true) {
            try {
                grp.addSt();
                } catch (Except e) {
                System.out.println(e.getMessage());
                break;
            } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        
        grp.findStud();
        System.out.println();
        grp.delStud();
        System.out.println();
        try {
        grp.sortSurname();
        
        System.out.println();
    } catch (NullPointerException e) {
            System.out.println("В группе меньше 10 студентов");
         
          
        }
        
        
    }
}
