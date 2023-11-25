package topic10.movies;

import java.sql.*;

public class Database {

    // SQL operations

    private String databasePath;
    Database(String databasePath) { // constructor

        this.databasePath = databasePath;

        // create table, or make sure it is created

        try (
                Connection connection = DriverManager.getConnection(databasePath);
                Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE IF NOT EXISTS movies (name TEXT, stars INTEGER, watched BOOLEAN)");

        } catch (SQLException e) {
            System.out.println("Error creating movie DB table because " + e);
        }

    }

    public void addNewMovie(Movie movie) {

        // don't make SQL string that include strings from variables or use string formatting either
        // to prevent security problem and error
        // use PreparedStatement & parameterize data using question mark
        String insertSQL = "INSERT INTO movies VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            // set each values for prepareStatement
            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();
        }
        catch (SQLException e) {
            System.out.println("Error adding movie DB table because " + e);
        }

    }

}
