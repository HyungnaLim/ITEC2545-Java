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


    public static int getRatingOutOfFive() { // rating validation
        int rating = positiveIntInput("What is your rating, in stars out of 5?");
        while (rating < 0 || rating > 5 ) {
            System.out.println("Error, enter a number between 0 and 5");
            rating = positiveIntInput("What is your rating, in stars out of 5?");
        }
        return rating;
    }


    public static String getNonEmptyName() { // name validation
        String name = stringInput("Enter the movie name");
        while (name.isEmpty()) {
            System.out.println("Error, enter a name");
            name = stringInput("Enter the movie name");
        }
        return name;
    }


    public static void addNewMovie() {
        do {
            String movieName = getNonEmptyName();
            boolean movieWatched = yesNoInput("Have you watched this movie yet?");
            int movieStars = 0;
            if (movieWatched) {
                movieStars = getRatingOutOfFive();
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
            System.out.println("-- Movie List --");
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
