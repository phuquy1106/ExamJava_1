package model;

import utils.Validator;

import java.util.List;
import java.util.Scanner;

public class Student extends Menber {
    private String batch;
    private double mark1;
    private double mark2;

    public Student() {
    }

    public Student(String batch, double mark1, double mark2) {
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public Student(int id, String name, String numberPhone, String address, String batch, double mark1, double mark2) {
        super(id, name, numberPhone, address);
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    @Override
    public void inputMenber(List<Menber> menberList) {
        Scanner scanner = new Scanner(System.in);
        super.inputMenber(menberList);
        this.batch = Validator.getString(scanner,"Enter batch: ");
        this.mark1 = Validator.getDouble(scanner,"Enter mark 1: ");
        this.mark2 = Validator.getDouble(scanner,"Enter mark 2: ");

    }

    @Override
    public String toString() {
        return super.toString() +
                "batch='" + batch + '\'' +
                ", mark1= " + mark1 +
                ", mark2= " + mark2+
                ", avg= "+this.avgMark();
    }
    public double avgMark(){
        return (this.mark1+this.mark2)/2;
    }
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }
}