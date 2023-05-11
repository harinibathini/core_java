package jdbc.bankms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Connect {
    public static Connection create() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/javajdbc";
        String user = "root";
        String password = "81189149@hH";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }
}
