package topic10.movies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    // SQL operations

    private String databasePath;

    Database(String databasePath) { // constructor

        this.databasePath = databasePath;

        // create table, or make sure it is created

        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    "movies (id INTEGER PRIMARY KEY," +
                    "name TEXT UNIQUE CHECK(length(name>= 1))," +
                    "stars INTEGER CHECK(stars>=0 and stars<=5))," +
                    "watched BOOLEAN)");

        } catch (SQLException e) {
            System.out.println("Error creating movie DB table because " + e);
        }

    }


    public void addNewMovie(Movie movie) {

        // don't make SQL string that include strings from variables or use string formatting either
        // to prevent security problem and error
        // use PreparedStatement & parameterize data using question mark
        String insertSQL = "INSERT INTO movies (name, stars, watched) VALUES (?, ?, ?)";

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

    public List<Movie> getAllMovies() {
        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement()) {

            ResultSet movieResult = statement.executeQuery("SELECT * FROM movies ORDER BY id");

            List<Movie> movies = new ArrayList<>();

            while (movieResult.next()) {
                int id = movieResult.getInt("id");
                String name = movieResult.getString("name");
                int stars = movieResult.getInt("stars");
                boolean watched = movieResult.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException sqle) {
            System.err.println("Error querying movie DB table because " + sqle);
            return null;
        }

    }

    public List<Movie> getAllMoviesByWatched(boolean watchedStatus) {

        try (Connection connection = DriverManager.getConnection(databasePath);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM movies WHERE watched = ?")) {

            preparedStatement.setBoolean(1, watchedStatus);
            ResultSet movieResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()) {
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        } catch (SQLException sqle) {
            System.err.println("Error querying movie DB table because " + sqle);
            return null;
        }
    }

    public void updateMovie(Movie movie) {
        String sql = "UPDATE movies SET stars = ?, watched = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, movie.getStars());
            preparedStatement.setBoolean(2, movie.isWatched());
            preparedStatement.setInt(3, movie.getId());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.err.println("Error querying movie DB table because " + e);
        }
    }

    public void deleteMovie(Movie movie) {
        try (Connection connection = DriverManager.getConnection(databasePath);
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM movies WHERE id = ?")) {

            preparedStatement.setInt(1, movie.getId());
            preparedStatement.execute();

        } catch (SQLException e) {
            System.err.println("Error querying movie DB table because " + e);
        }
    }

    public List<Movie> searchMovie(String searchTerm) {
        String sql = "SELECT * FROM movies WHERE upper(name) LIKE upper(?)";
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, "%" + searchTerm + "%"); // use % for partial matches
            ResultSet movieResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();
            while (movieResults.next()) {
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }
            return movies;

        } catch (SQLException e) {
            System.err.println("Error querying movie DB table because " + e);
            return null;
        }
    }

}
