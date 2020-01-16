public class Movie {
    private String title;
    private MovieGenre movieGenre;
    private int price;
    private String director;

    public Movie(String title, MovieGenre movieGenre, int price, String director) {
        this.title = title;
        this.movieGenre = movieGenre;
        this.price = price;
        this.director = director;
    }


    public Movie(String title, MovieGenre movieGenre, int price) {
        this.title = title;
        this.movieGenre = movieGenre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }


    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

  /*  public static void printAllMovies(Movie[] myMovie) {

        for (int i = 0; i < myMovie.length; i++) {
            Movie movie = myMovie[i];
            // printMovieDetails(book);
            //movie.printMovieDetails();
        }
    }
*/
    public void printMovieDetails() {

        System.out.println("The title of this movie is: " + title);
        System.out.println("The genre of this movie is: " + movieGenre);
        System.out.println("The price of this movie is: " + price + "\n");

        if (director != null)
        System.out.println("The genre of this movie is: " + director);

    }
}
