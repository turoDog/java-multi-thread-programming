package chapter06.section07.pro_1_singleton_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section07.pro_1_singleton_9 <br/>
 * Date:2019/12/1 22:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyObject {

    public enum MyEnumSingleton {
        connectionFactory;

        private Connection connection;

        private MyEnumSingleton() {
            try {
                System.out.println("创建MyObject对象");
                String url = "jdbc:sqlserver://localhost:1079;databaseName=y2";
                String username = "sa";
                String password = "";
                String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, username,
                        password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }

}
