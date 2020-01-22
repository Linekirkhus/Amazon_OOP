

public class Movie implements Product, Comparable<Movie> {
    protected String title;
    protected MovieGenre movieGenre;
    protected int price;
    protected long productId;


    public Movie(String title, MovieGenre movieGenre, int price, long productId) {
        this.title = title;
        this.movieGenre = movieGenre;
        this.price = price;
        this.productId = productId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
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


    @Override
    public int compareTo(Movie sortedMovieList) {
        if (this.productId == sortedMovieList.productId)
            return 0;
        if (this.productId < sortedMovieList.productId) {
            return -1;
        }
        return 1;
    }


    @Override
    public void printDetails() {
        System.out.println("The title of this movie is: " + this.title);
        System.out.println("The genre of this movie is: " + this.movieGenre);
        System.out.println("The price of this movie is: " + this.price);
        System.out.println("The product ID of this movie is: " + this.productId);

        System.out.println("");
    }

   /* @Override
    public int compareTo(Movie sortedMovieList ) {
        return 0;
    }*/
}