package jdbc;

import java.sql.*;

//public class JDBCDemo {
//    public static void main(String[] args) {
        //1: Loading the Driver
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//           // 2: Establish the connection
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_java_eltp","root","81189149@hH");
//            //3: Write query:using statement
//           Statement statement = connection.createStatement();
//           //4: ResultSet
//            ResultSet resultSet = statement.executeQuery("select * from Student");
//
//            while(resultSet.next()){
//                System.out.println(resultSet.getInt(1)+"==="+resultSet.getInt(2)+"==="+resultSet.getInt(3));
//            }
//
//            System.out.println("Done successfully....");
//        } catch (ClassNotFoundException | SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
