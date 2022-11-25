package Bai1.StudentInfoManipulation;

import java.io.*;

import Bai1.Model.Student;

public class WriteStudentInfo {
    public File file;
    public FileOutputStream fos;
    public ObjectOutputStream writeInfo;
    public boolean append;

    public WriteStudentInfo() throws Exception{
        try{
            this.append = false;
            this.file = new File("Student.txt");
            this.fos = new FileOutputStream(file);
            this.writeInfo = new ObjectOutputStream(fos);
        }catch(Exception e){

        }
    }


    public void writeInfo(Student sinhVien) throws Exception{
        try{
            this.writeInfo.writeObject(sinhVien);
        }catch(Exception ex){
            System.out.println("Ghi thất bại");
        }
    }
}
