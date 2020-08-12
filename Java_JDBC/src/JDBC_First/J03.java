package JDBC_First;

import jdk.nashorn.internal.ir.CallNode;

import java.sql.*;

/**
 * @author Charlie Puth
 * @version 1.0
 **/
public class J03 {
    public static void main(String[] args) throws Exception {
        String sql = "select * from account";
        Connection connection = DriverManager.getConnection("jdbc:mysql:///First", "root", "admin");
        Statement statement = connection.createStatement();
        //DQL用ResultSet接受
        ResultSet resultSet = statement.executeQuery(sql);
        //用while循环判断next
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int salary = resultSet.getInt(2);
            System.out.println(name+ "----"+salary);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
