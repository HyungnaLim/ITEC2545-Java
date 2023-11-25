package topic10.movies;

import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    // this is the main program

    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";
    private static Database database;


    public static void main(String[] args) {
        database = new Database(DB_PATH);
        addNewMovie();
        checkIfWatchedAndRate();
        deleteWatchedMoviesByName();
        searchByName();
        displayAllMovies();
    }


    public static void addNewMovie() {
        do {
            String movieName = stringInput("Enter the movie name");
            boolean movieWatched = yesNoInput("Have you watched this movie yet?");
            int movieStars = 0;
            if (movieWatched) {
                movieStars = positiveIntInput("What is your rating, in stars out of 5?");
                // todo add validation, make sure number is between 0 and 5
            }
            Movie movie = new Movie(movieName, movieStars, movieWatched);
            database.addNewMovie(movie);


        } while (yesNoInput("Add a movie to the watchlist?"));
    }


    public static void displayAllMovies() {
        List<Movie> movies = database.getAllMovies();
        if (movies.isEmpty()) {
            System.out.println("No movies in the list");
        } else {
            for (Movie m : movies) {
                System.out.println(m);
            }
        }
    }


    public static void checkIfWatchedAndRate() {
        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);

        for (Movie m : unwatchedMovies) {
            boolean hasWatched = yesNoInput("Have you watched " + m.getName() + " yet?");
            if (hasWatched) {
                int stars = positiveIntInput("What is your rating for " + m.getName() + " out of 5?");
                m.setWatched(true);
                m.setStars(stars);
                database.updateMovie(m);
            }
        }
    }


    public static void deleteWatchedMoviesByName() {
        System.out.println("Here are all the movies you have seen");
        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);
        for (Movie m : watchedMovies) {
            boolean delete = yesNoInput("Delete " + m.getName() + "?");
            if (delete) {
                database.deleteMovie(m);
                System.out.println("successfully deleted");
            }
        }
    }


    public static void searchByName() {
        String searchTerm = stringInput("Enter the movie name to search for");
        List<Movie> movieMatches = database.searchMovie(searchTerm);

        if (movieMatches.isEmpty()) {
            System.out.println("No matches");
        } else {
            for (Movie m : movieMatches) {
                System.out.println(m);
            }
        }
    }


}
