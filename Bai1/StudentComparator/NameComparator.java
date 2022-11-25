package Bai1.StudentComparator;

import java.util.Comparator;

import Bai1.Model.Student;

public class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student stu1, Student stu2) {
        String[] arr1 = stu1.getName().split(" ");
        String[] arr2 = stu2.getName().split(" ");

        return arr1[arr1.length-1].compareTo(arr2[arr2.length-1]);

    }
    
}
