package Bai1.StudentManagerFuntion;

import java.util.ArrayList;

import Bai1.Model.Student;
import Bai1.StudentComparator.NameComparator;
import Bai1.StudentInfoManipulation.ReadStudentInfo;
import Bai1.StudentInfoManipulation.WriteStudentInfo;

public class SortStudentByName {
    public static void sort(ArrayList<Student> list) throws Exception{
        try{
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();

            list.sort(new NameComparator());
            WriteStudentInfo write = new WriteStudentInfo();
            for(int i=0;i<list.size();i++){
                write.writeInfo(list.get(i));
            }
            write.fos.close();

            list = read.readInfo();
            
        }catch(Exception e){

        }
    }
}
