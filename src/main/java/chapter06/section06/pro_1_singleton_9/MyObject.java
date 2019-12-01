package chapter06.section06.pro_1_singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Project Name:java-multi-thread-programming <br/>
 * Package Name:chapter06.section06.pro_1_singleton_9 <br/>
 * Date:2019/12/1 22:17 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public enum MyObject {

    connectionFactory;

    private Connection connection;

    private MyObject() {
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:sqlserver://localhost:1079;databaseName=ghydb";
            String username = "sa";
            String password = "";
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
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
