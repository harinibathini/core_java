package jdbc.student_management_durgesh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
    public static boolean insertStudentToDB(Student student){
        boolean f = false;
        try {

            Connection connection = ConnectionProvider.createConnection();
            String q = "insert into students(sname,sphone,scity)values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(q);
            preparedStatement.setString(1,student.getStudentName());
            preparedStatement.setString(2,student.getStudentPhone());
            preparedStatement.setString(3,student.getStudentCity());

            preparedStatement.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    return f;
    }

    public static boolean deleteStudentToDB(int id){
        boolean f = false;
        try {

            Connection connection = ConnectionProvider.createConnection();
            String q = "delete from students where sid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(q);
            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllStudents(){
        boolean f = false;
        try {

            Connection connection = ConnectionProvider.createConnection();
            String q = "select * from students;";
            Statement statement = connection.createStatement();
           // statement.setInt(1,id);

            ResultSet resultSet = statement.executeQuery(q);
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone = resultSet.getString(3);
                String city = resultSet.getString(4);
                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Phone: "+phone);
                System.out.println("City: "+city);
                System.out.println("++++++++++++++++++++++++++++++++");
            }
            f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
