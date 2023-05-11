package jdbc;

import java.sql.*;

public class MainCalling {
    Connection connection = Connectivity.connection();
    void createDatabase() {
        try {
            Statement statement = connection.createStatement();
            try {
                ResultSet resultSet = statement.executeQuery("select * from student");
                System.out.println("Already exists");
            } catch (SQLException e) {
                if (e.getMessage().equals("Table 'jan_java_eltp.student' doesn't exist")) {
                    statement.execute("create table students (id int,name varchar(25),marks id)");
                    statement.execute("create table result (id int,name varchar(25),marks id)");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
