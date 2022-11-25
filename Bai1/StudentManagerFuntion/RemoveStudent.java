package Bai1.StudentManagerFuntion;

import java.util.ArrayList;
import java.util.Scanner;

import Bai1.Model.Student;
import Bai1.StudentInfoManipulation.*;

public class RemoveStudent{
    public static void removeByID(ArrayList<Student> list, String ID) throws Exception{
        try{
            Scanner input = new Scanner(System.in);
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();
            System.out.print("Nhap ID can xoa: ");
            ID = input.nextLine();
            WriteStudentInfo write = new WriteStudentInfo();

            boolean founded = false;
            for(int i=0;i<list.size();i++){
                if(list.get(i).getID().compareTo(ID) != 0){
                    write.writeInfo(list.get(i));
                }else{
                    founded = true;
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

    public static void removeByName(ArrayList<Student> list, String name) throws Exception{
        try{
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();
            // System.out.print("Nhap ID can xoa: ");
            // ID = input.nextLine();
            WriteStudentInfo write = new WriteStudentInfo();

            boolean founded = false;
            for(int i=0;i<list.size();i++){
                if(list.get(i).getName().compareTo(name) != 0){
                    write.writeInfo(list.get(i));
                }else{
                    founded = true;
                }
            }
            if(founded == false){
                System.out.println("Khong tim thay ten");
            }
            write.fos.close();

            list = read.readInfo();
        }catch(Exception e){

        }
    }

    public static void removeByDTB(ArrayList<Student> list, float DTB) throws Exception{
        try{
            ReadStudentInfo read = new ReadStudentInfo();
            list = read.readInfo();
            //System.out.print("Nhap ID can xoa: ");
            //ID = input.nextLine();
            WriteStudentInfo write = new WriteStudentInfo();

            boolean founded = false;
            for(int i=0;i<list.size();i++){
                if(list.get(i).getDiemTB() != DTB){
                    write.writeInfo(list.get(i));
                }else{
                    founded = true;
                }
            }
            if(founded == false){
                System.out.println("Khong tim thay ten");
            }
            write.fos.close();

            list = read.readInfo();
        }catch(Exception e){

        }
    }
}
