package Bai1.StudentManagerFuntion;

import java.util.ArrayList;

import Bai1.Model.Student;
import Bai1.StudentInfoManipulation.ReadStudentInfo;

public class PrintStudentList {
    public static void print(ArrayList<Student> list) throws Exception{
        try{
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();
            for(Student stu : list){
                System.out.println(stu);
            }
        }catch(Exception e){

        }
    }
}
