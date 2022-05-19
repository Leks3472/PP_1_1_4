package jm.task.core.jdbc.util;

//https://www.youtube.com/watch?v=F1lQ7cE3nuE&list=PLIU76b8Cjem5qdMQLXiIwGLTLyUHkTqi2&index=4

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Or885522!";

        public static Connection getConnection () {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
               // if (!connection.isClosed()) {
                    System.out.println("Соединение с БД установлено Connection is OK");
                //}
                //connection.close();
            } catch (SQLException e) {
                System.out.println("Соединение с БД не установлено Connection not established");
            }
            return connection;
        }

}
