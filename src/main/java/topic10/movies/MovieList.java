package topic10.movies;

import static input.InputUtils.*;

public class MovieList {

    // this is the main program

    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";
    private static Database database;

    public static void main(String[] args) {
        database = new Database(DB_PATH);
        addNewMovie();
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


}
