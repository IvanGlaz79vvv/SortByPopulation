package Main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        List<newObject> listIdSortByPopulation = new ArrayList<>();


        String SQL = "SELECT * FROM world.city";  // ORDER BY Population DESC";
        String SQLSortPopulation = "SELECT * FROM world.city ORDER BY Population DESC";
        String URL = "jdbc:mysql://localhost:3306/mysql";
        String USERNAME = "root";
        String PASSWORD = "pass";


        Connection connection = new DBProcessor().getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(SQL);

        while (results.next()) {
            results.getInt(1);
            newObject a = new newObject(results.getInt(1), results.getString(2), results.getString(3), results.getString(4), results.getInt(5));
            listIdSortByPopulation.add(a);

            System.out.println(listIdSortByPopulation.size());

        }
        for (int i = 0; i < listIdSortByPopulation.size(); i++) {
            System.out.println(i + ". " + listIdSortByPopulation.get(i).toString() + "\s");

//            results.close();
//            statement.close();
//            connection.close();
            results = statement.executeQuery(SQLSortPopulation);
            while (results.next()) {
                results.getInt(1);
                newObject a = new newObject(results.getInt(1), results.getString(2), results.getString(3), results.getString(4), results.getInt(5));
                listIdSortByPopulation.add(a);

                System.out.println(listIdSortByPopulation.size());

            }
            results.close();
            statement.close();
            connection.close();
            for ( i = 0; i < listIdSortByPopulation.size(); i++) {
                System.out.println(i + ". " + listIdSortByPopulation.get(i).toString() + "\s");
            }
        }
    }
}