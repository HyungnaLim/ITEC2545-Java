package topic10.movies;

public class Movie {

    // stores movie data for one movie

    private String name;
    private int stars;
    private boolean watched;


    // constructor
    Movie(String name, int stars, boolean watched) {
        this.name = name;
        this.stars = stars;
        this.watched = watched;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        return "Movie name: " + name + " | Star: " + stars + " | Watched: " + watched;
    }
}
