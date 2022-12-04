import main.MenberManager;
import model.Menber;
import model.Student;
import model.Teacher;
import utils.Menu;
import utils.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Menber>  menberList =  new ArrayList<>();
        MenberManager menberManager = new MenberManager(menberList);
        Menu menu = new Menu();
        menberList.add(new Student(123,"quy","quy","quy","abc",10,10));
        menberList.add(new Student(123,"quy","quy","quy","abc",5,10));
        menberList.add(new Student(123,"quy","quy","quy","abc",8,10));


        int n;
        do{
            menu.printMenu();
            boolean check;
            do {
                n = Validator.getInt(scanner, "Choice: ");

                if ((n < 1) || (n > 7))
                    System.out.println("Enter a number from 1 to 7");
            } while ((n < 1) || (n > 7));
            switch (n)
            {
                case 1:{
                    menberManager.addStudent();
                    break;
                }
                case 2:{
                    menberManager.addteacher();
                    break;
                }
                case 3:{
                    menberManager.printStudent();
                    break;
                }
                case 4:{
                    menberManager.printTeacher();
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
                case 7:{
                    System.out.println("End program");
                    break;
                }
            }
        }while (n!=7);
    }
}