package topic10.movies;

public class Movie {

    // stores movie data for one movie

    private int id;
    private String name;
    private int stars;
    private boolean watched;


    // constructor without id
    Movie(String name, int stars, boolean watched) {
        this.name = name;
        this.stars = stars;
        this.watched = watched;
    }

    // constructor with id
    Movie(int id, String name, int stars, boolean watched) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Movie name: " + name + " | Star: " + stars + " | Watched: " + watched;
    }
}
