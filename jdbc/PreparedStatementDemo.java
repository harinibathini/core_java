package jdbc;

import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        try {
            //1
            Class.forName("com.mysql.jdbc.Driver");

            //2
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_java_eltp", "root", "81189149@hH");
            //3
//            preparedStatement = connection.prepareCall("insert into student values(7,'xyz',90)");
            preparedStatement = connection.prepareCall("insert into student values(?,?,?)");
            preparedStatement.setInt(1, 8);
            preparedStatement.setString(2, "SRK");
            preparedStatement.setInt(3, 98);
            int numberOfRecords = preparedStatement.executeUpdate();
            System.out.println("Number of records are added.." + numberOfRecords);

            //4
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_java_eltp", "root", "81189149@hH");
//            //3
//            preparedStatement = connection.prepareCall("insert into student values(7,'xyz',90)");
//            int numberOfRecords = preparedStatement.executeUpdate();
//            System.out.println("Number of records are added.."+numberOfRecords);

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
