package jdbc.student_management_durgesh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("ENTER 1 TO ADD STUDENT");
            System.out.println("ENTER 2 TO DELETE STUDENT");
            System.out.println("ENTER 3 TO DISPLAY STUDENT");
            System.out.println("ENTER 0 TO EXIT APP");
            int choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    System.out.println("-- ADD STUDENT");
                    System.out.println("Enter student name: ");
                    String name = br.readLine();

                    System.out.println("Enter student phnNo: ");
                    String phone = br.readLine();

                    System.out.println("Enter student city: ");
                    String city = br.readLine();

                    Student student = new Student(name,phone,city);
                    boolean answer = StudentDAO.insertStudentToDB(student);
                    if(answer){
                        System.out.println("student record added successfully");
                    }else{
                        System.out.println("something went wrong try again..");
                    }
                   // StudentDAO.insertStudentToDB(student);
                    System.out.println(student);

                    break;
                case 2:
                    System.out.println("-- DELETE STUDENT");
                    System.out.println("enter the id of student to be deleted");
                    int id = Integer.parseInt(br.readLine());
                   boolean answer1 = StudentDAO.deleteStudentToDB(id);
                    if(answer1){
                        System.out.println("student record deleted successfully");
                    }else{
                        System.out.println("something went wrong try again..");
                    }
                 //   System.out.println(student);

                    break;
                case 3:
                    System.out.println("-- DISPLAY STUDENTS");
                    StudentDAO.showAllStudents();
                    break;
                case 0:
                    System.out.println("--  EXIT");
                    System.exit(0);
                default:
                    System.out.println("-- Enter a valid choice");
            }

        }
    }
}
