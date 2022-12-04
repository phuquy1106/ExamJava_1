
package model;

import utils.Menu;
import utils.Validator;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Scanner;

public class Teacher extends Menber {
    private double salary;
    private int numberWorkDay;

    public Teacher() {
    }

    public Teacher(double salary, int numberWorkDay) {
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    public Teacher(int id, String name, String numberPhone, String address, double salary, int numberWorkDay) {
        super(id, name, numberPhone, address);
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }


    @Override
    public void inputMenber(List<Menber> menberList) {
        Scanner scanner = new Scanner(System.in);
        super.inputMenber(menberList);
//        this.salary = Validator.getDouble(scanner,"Enter salary: ");
        this.numberWorkDay = Validator.getInt(scanner, "Enter numberWorkDay: ");
    }


    @Override
    public String toString() {
        return super.toString() +
                "salary=" + this.getSalary() +
                ", numberWorkDay=" + numberWorkDay;
    }


    public double getSalary() {
        return numberWorkDay * 800000;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }

    public int compare(List<Menber>menberList) {
        if (getSalary() > this.getSalary()) {
            return 1;
        } else if (getSalary() < this.getSalary()) {
            return -1;
        } else {
            return 0;
        }

    }
}

