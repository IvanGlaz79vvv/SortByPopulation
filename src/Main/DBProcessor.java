package Main;

import java.sql.*;

public class DBProcessor {
    private Connection connection;

    public DBProcessor() {
    }

    public Connection getConnection(String url, String username, String password) throws SQLException {
        if (connection != null) {
            System.out.println("Подключение уже создано");
            return connection;
        }
        connection = DriverManager.getConnection(url, username, password);
        System.out.println("Создаётся новое подключение");
        return connection;
    }
}
