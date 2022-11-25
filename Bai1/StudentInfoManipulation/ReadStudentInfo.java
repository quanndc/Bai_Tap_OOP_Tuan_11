package Bai1.StudentInfoManipulation;
import java.io.*;
import java.util.ArrayList;

import Bai1.Model.Student;
public class ReadStudentInfo {
    public ReadStudentInfo(){};

    public ArrayList<Student> list = new ArrayList<>();
    public ArrayList<Student> readInfo() throws Exception{
        try{
            File file = new File("Student.txt");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream readInfo = new ObjectInputStream(fis);
            Student sinhVien = null;
            while((sinhVien = (Student) readInfo.readObject()) != null){
                this.list.add(sinhVien);
                
            }
            readInfo.close();
            fis.close();
        }
        catch(EOFException e){

        }
        catch(Exception e){
            System.out.println("Failed: " + e.getMessage());
        }
        return this.list;
    } 
}
