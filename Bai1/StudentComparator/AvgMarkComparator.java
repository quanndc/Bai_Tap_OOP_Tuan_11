package Bai1.StudentComparator;

import java.util.Comparator;

import Bai1.Model.Student;

public class AvgMarkComparator implements Comparator<Student>{

    @Override
    public int compare(Student stu1, Student stu2) {
        return stu1.getDiemTB().compareTo(stu2.getDiemTB());
    }
   
}
