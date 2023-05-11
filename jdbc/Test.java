package jdbc;

import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
       TableAlreadyExistsTest ts = new TableAlreadyExistsTest();
       ts.createDatabase();

    }
}
