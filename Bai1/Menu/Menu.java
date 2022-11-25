package Bai1.Menu;

import java.util.ArrayList;
import java.util.Scanner;

import Bai1.Model.Student;
import Bai1.StudentManagerFuntion.AddStudent;
import Bai1.StudentManagerFuntion.FindHighestAvgMarks;
import Bai1.StudentManagerFuntion.PrintStudentList;
import Bai1.StudentManagerFuntion.RemoveStudent;
import Bai1.StudentManagerFuntion.SortStudentByName;
import Bai1.StudentManagerFuntion.UpdateInfo;

public class Menu {
    public static void generateMenu() throws Exception{
        System.out.println("1. Add student");
        System.out.println("2. Remove student");
        System.out.println("3. Update student info");
        System.out.println("4. Print student list");
        System.out.println("5. Sort student by name");
        System.out.println("6. Find student with highest avg mark");
        System.out.println("7. Exit");
        
        
        int choice = 0;
        ArrayList<Student> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        do{
            
            System.out.print("Input your choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    AddStudent.add(list);
                    break;
                case 2:
                    RemoveStudent.removeByID(list, new String());
                    break;
                case 3:
                    UpdateInfo.updateById(list, new String());
                    break;
                case 4:
                    PrintStudentList.print(list);
                    break;
                case 5:
                    SortStudentByName.sort(list);
                    break;
                case 6:
                    System.out.println("Student has highest Avg Marks: ");
                    System.out.println(FindHighestAvgMarks.find(list));
                    break; 
                case 7:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 7);
    }
}
