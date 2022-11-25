package Bai1.StudentManagerFuntion;

import java.util.ArrayList;
import java.util.Scanner;

import Bai1.StudentInfoManipulation.*;
import Bai1.Model.Student;

public class UpdateInfo {
    public static void updateById(ArrayList<Student> list, String ID) {
        try{
            Scanner input = new Scanner(System.in);
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();
            System.out.print("Input ID of student you want to update: ");
            ID = input.nextLine();
            WriteStudentInfo write = new WriteStudentInfo();

            boolean founded = false;
            for(int i=0;i<list.size();i++){
                if(list.get(i).getID().compareTo(ID) != 0){
                    write.writeInfo(list.get(i));
                }else{
                    founded = true;
                    System.out.println("Da tim thay sinh vien muon cap nhat thong tin");
                    System.out.println(list.get(i).toString());
                    list.get(i).addStudent();
                    write.writeInfo(list.get(i));
                    System.out.println("Cap nhat thong tin thanh cong");
                }
            }
            if(founded == false){
                System.out.println("Khong tim thay ID");
            }
            write.fos.close();


            list = read.readInfo();
        }catch(Exception e){

        }
    }
}

