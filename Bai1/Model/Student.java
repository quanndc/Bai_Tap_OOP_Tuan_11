package Bai1.Model;
import java.io.*;
import java.util.Scanner;
public class Student implements Serializable{
    
    public String ID;
    public String getID() {
        return ID;
    }
    public void setId(String ID) {
        this.ID = ID;
    }

    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Float diemTB;
    public Float getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public Student(){
        this.ID = "";
        this.name = "";
        this.diemTB = 0f;
    }

    public Student(String ID, String name, float diemTB){
        this.ID = ID;
        this.name = name;
        this.diemTB = diemTB;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.getID());
        buffer.append("\t\t");
        buffer.append(this.getName());
        buffer.append("\t\t");
        buffer.append(this.getDiemTB());
        buffer.append("\t\t");
    
        return buffer.toString();
    }

    public void addStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.setId(input.nextLine());
        System.out.print("Nhap ho ten: ");
        this.setName(input.nextLine());
        System.out.print("Nhap DTB: ");
        this.setDiemTB(Float.parseFloat(input.nextLine()));
        //input.close();
    }
}
