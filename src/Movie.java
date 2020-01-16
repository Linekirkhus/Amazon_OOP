public class Movie {
    private String title;
    private MovieGenre movieGenre;
    private int price;
    private String director;

    public Movie(String title, MovieGenre movieGenre, int price, String director) {
        this (title, movieGenre, price);
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

    public void printMovieDetails() {

        System.out.println("The title of this movie is: " + this.title);
        System.out.println("The genre of this movie is: " + this.movieGenre);
        System.out.println("The price of this movie is: " + this.price);

        if (director != null) {
            System.out.println("The director of this movie is: " + director);
        }
        System.out.println("");
    }
}
