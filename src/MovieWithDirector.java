public class MovieWithDirector extends Movie{

    private String director;

    public MovieWithDirector(String title, MovieGenre movieGenre, int price, String director, long productId) {
        super(title, movieGenre, price,  productId);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void printDetails() {
        super.printDetails();
       // if (director != null) {
            System.out.println("The director of this movie is: " + director);
     //   }
    }
}
