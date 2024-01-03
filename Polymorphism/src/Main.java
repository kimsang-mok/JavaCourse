public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();
//        Adventure theMovie = new Adventure("Star Wars");

        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();

    }
}
