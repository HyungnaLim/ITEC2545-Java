package topic9;

import java.sql.*;

public class HelloDB {
    public static void main(String[] args) throws SQLException {
        // throw SQLException to avoid crashing

        /*
        Class note
        JDBC : java database connection
        SQLite : a widely used embedded database
        to connect to a database, we need to provide a connection string (URI)
        which contains protocol (type of DB) and location of the DB
        */

        String url = "jdbc:sqlite:hello.sqlite";

        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement(); // connect to database

        // write and run SQL query
        // create table
        String createTableSQL = "CREATE TABLE cats (name TEXT, age INTEGER)";
        // send the SQL code to database
        statement.execute(createTableSQL);

        // insert data
        String insertDataSQL = "INSERT INTO cats VALUES ('Maru', 10)";
        statement.execute(insertDataSQL);

        String insertDataSQL2 = "INSERT INTO cats VALUES ('Hello Kitty', 40)";
        statement.execute(insertDataSQL2);

        // select
        String getAllDataSQL = "SELECT * FROM cats";
        ResultSet allCats = statement.executeQuery(getAllDataSQL);
        // loading all data into memory could be bad or impossible if the size of data is very large
        // ResultSet helps access the data one row at a time

        while (allCats.next()) {
            //next() method returns true if there is another row to read, false otherwise
            String name = allCats.getString("name");
            int age = allCats.getInt("age");
            System.out.println(name + " is " + age + " years old");
        }

        // it is important to close database connections in your program
        connection.close();



    }
}
