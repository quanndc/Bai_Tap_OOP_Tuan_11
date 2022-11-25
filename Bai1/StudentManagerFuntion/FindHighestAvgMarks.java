package Bai1.StudentManagerFuntion;

import java.util.ArrayList;

import Bai1.Model.Student;
import Bai1.StudentComparator.AvgMarkComparator;
import Bai1.StudentInfoManipulation.ReadStudentInfo;

public class FindHighestAvgMarks {
    public static Student find(ArrayList<Student> list) throws Exception{
        try{
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();
        }catch(Exception e){

        }
        return list.stream().max(new AvgMarkComparator()).get(); 

    }
}
