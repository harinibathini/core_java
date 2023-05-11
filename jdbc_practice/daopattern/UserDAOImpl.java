package jdbc_practice.daopattern;

import java.sql.*;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAOInterface {

//    private String url = "jdbc.mysql://localhost:3306/javajdbc";
//    private String user = "root";
//    private String password = "81189149@hH";
//    private static final String INSERT_USERS_SQL = "INSERT INTO users" + " (name,email,country) VALUES " + " (?,?,?);";
//    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
//    private static final String SELECT_ALL_USERS = "select * from users";
//    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
//    private static final String UPDATE_USERS_SQL = "update users set name = ?,email = ?,country = ? where id = ?;";
//
//    protected Connection getConnection() {
//        Connection connection = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection(url, user, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return connection;
//    }
//
//
//    @Override
//    public void insertUser(User user) throws SQLException {
//        try(Connection connection = getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
//            preparedStatement.setString(1,user.getName());
//            preparedStatement.setString(2,user.getEmail());
//            preparedStatement.setString(3,user.getCountry());
//            preparedStatement.executeUpdate();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public boolean updateUser(User user) throws SQLException {
//        boolean rowUpdated;
//        try(Connection connection = getConnection();
//        PreparedStatement preparedStatement1 = connection.prepareStatement(UPDATE_USERS_SQL);){
//            preparedStatement1.setString(1,user.getName());
//            preparedStatement1.setString(2,user.getEmail());
//            preparedStatement1.setString(3,user.getCountry());
//            preparedStatement1.setInt(4,user.getId());
//
//            rowUpdated = preparedStatement1.executeUpdate() > 0;
//        }
//        return rowUpdated;
//    }
//
//    @Override
//    public User selectUser(int id) {
//        User user = null;
//        try(Connection connection = getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);){
//            PreparedStatement.setInt(1,id);
//            System.out.println(preparedStatement);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while(resultSet.next()){
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String country = resultSet.getString("country");
//                user = new User(id,name,email,country);
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        return user;
//    }
//
//    @Override
//    public List<User> selectAllUsers() {
//        List<User> users = new ArrayList<>();
//        try(Connection connection = getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);){
//            System.out.println(preparedStatement);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while(resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String country = resultSet.getString("country");
//                users.add(new User(id,name,email,country));
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//
//        return users;
//    }
//
//    @Override
//    public boolean deleteUser(int id) throws SQLException {
//        boolean rowDeleted;
//        try(Connection connection = getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);){
//            preparedStatement.setInt(1,id);
//            rowDeleted = preparedStatement.executeUpdate() > 0;
//        }
//        return rowDeleted;
  //  }
}
