package JDBC_First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Charlie Puth
 * @version 1.0
 **/
public class J02 {
    public static void main(String[] args) throws Exception {
        //添加
//        String sql = "insert into  account values('wangwu',1000)";
//        Connection connection = DriverManager.getConnection("jdbc:mysql:///First", "root", "admin");
//        Statement statement = connection.createStatement();
//        int count = statement.executeUpdate(sql);
//        System.out.println(count);
//        if (count>0){
//            System.out.println("添加成功！");
//        }else {
//            System.out.println("失败！");
//        }
//        statement.close();
//        connection.close();
        // 删除
        String sql = "delete from account where salary = 1000 ";
        Connection connection = DriverManager.getConnection("jdbc:mysql:///First","root","admin");
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
        System.out.println(count);
        if (count>0){
            System.out.println("添加成功！");
        }else {
            System.out.println("失败！");
        }
        if (statement != null){
            statement.close();
        }
        if (connection != null){
            connection.close();
        }
    }
}
