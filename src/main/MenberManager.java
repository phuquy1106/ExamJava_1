package main;

import model.Menber;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MenberManager {
    private List<Menber> menberList;

    public MenberManager(List<Menber> menberList) {
        this.menberList = menberList;
    }

    public List<Menber> getMenberList() {
        return menberList;
    }

    public void setMenberList(List<Menber> menberList) {
        this.menberList = menberList;
    }

    public void addStudent() {
        Student student = new Student();
        student.inputMenber(menberList);
        menberList.add(student);
    }

    public void addteacher() {
        Teacher teacher = new Teacher();
        teacher.inputMenber(menberList);
        menberList.add(teacher);
    }

    public void printStudent() {
        for (Menber menber : menberList) {
            if (menber instanceof Student) {
                System.out.println(menber);
            }
        }

    }

    public void printTeacher() {
        for (Menber menber : menberList) {
            if (menber instanceof Teacher) {
                System.out.println(menber);
            }
        }
    }

}
