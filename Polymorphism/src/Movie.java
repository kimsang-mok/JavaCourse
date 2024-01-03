public class Movie {
    private String title;
    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(this.title + " is a " + instanceType + " film");
    }

    /*
    This kind of method, that returns a new instance object, is known as a factory method,
    in software programming design pattern

    Factory methods give us a way to get an object, without having to know the details of how create
    a new one, or specify the exact class we want
     */
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default ->  new Movie(title);
        };
    }
}

class Adventure extends Movie {
    public Adventure(String title) {
       super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens"
                );
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending"
        );
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Whatever 1",
                "Whatever 2",
                "Whatever 3"
        );
    }
}