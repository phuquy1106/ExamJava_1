package model;

import utils.Validator;

import java.util.List;
import java.util.Scanner;

public class Menber {
    private int id;
    private String name;
    private String numberPhone;
    private String address;

    public Menber(){ }

    public Menber(int id, String name, String numberPhone, String address) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public void inputMenber(List<Menber> menberList){
        Scanner scanner = new Scanner(System.in);
        boolean checkID;
        do{
            checkID = true;
            this.id = Validator.getInt(scanner,"Enter id: ");
            for(Menber menber: menberList){
                if(menber.getId()==this.id){
                    System.out.print("failed, re-enter: ");
                    checkID = false;
                    break;
                }
            }
        }while (!checkID);
        this.name = Validator.getString(scanner,"Enter name: ");
        this.numberPhone = Validator.getString(scanner,"Enter number Phone: ");
        this.address = Validator.getString(scanner,"Enter address: ");

    }

    @Override
    public String toString() {
        return "Menber" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
