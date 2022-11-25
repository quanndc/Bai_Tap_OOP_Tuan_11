package Bai1.StudentManagerFuntion;

import java.util.ArrayList;
import Bai1.Model.Student;
import Bai1.StudentInfoManipulation.*;

public class AddStudent {
    public static void add(ArrayList<Student> list) throws Exception{
        try{
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();

            Student sinhVien = new Student();
            sinhVien.addStudent();
            list.add(sinhVien);

            WriteStudentInfo write = new WriteStudentInfo();
            for(Student sv:  list){
                write.writeInfo(sv);
            }        
            write.fos.close();

            list = read.readInfo();
        }
        catch(Exception e){
            
        }
    }
}
