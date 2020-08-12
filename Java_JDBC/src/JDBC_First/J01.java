package JDBC_First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Charlie Puth
 * @version 1.0
 **/
public class J01 {
    public static void main(String[] args) throws Exception {
        // 注册驱动
        //Class.forName("com.mysql.jdbc.Driver");
        //获取数据库连接对象
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql:///First", "root", "admin"
        );
        //更新sql语句
        String sql = "delete from account where name ='lisi'";
        //执行sql的对象 statement
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
        //输出打印
        System.out.println(count);
        //释放资源
        statement.close();
        connection.close();
    }
}
