package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableDemo {
    public static void main(String[] args) {
        Connection connection;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_java_eltp","root","81189149@hH");
            CallableStatement callableStatement = connection.prepareCall("call InsertRecorrds(?,?,?)");
            callableStatement.setInt(1,8);
            callableStatement.setString(2,"sujan");
            callableStatement.setInt(3,89);
            boolean flag = callableStatement.execute();
            System.out.println("records has been affected or not: "+flag);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
