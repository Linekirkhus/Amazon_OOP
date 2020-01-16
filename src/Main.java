

public class Main {
    private static Book[] myBooks = new Book[2];
    public static Movie[] myMovies = new Movie[3];

    public static void main(String[] args) {
        Book book1 = new Book("My Story", "Line K", 145);
        myBooks[0] = book1;

        Book book2 = new Book("Another Story", "Rina", 987);
        myBooks[1] = book2;

        Movie movie1 = new Movie("Hidden Figures", MovieGenre.DRAMA, 100);
        myMovies[0] = movie1;


        Movie movie2 = new Movie("Shark attack Five", MovieGenre.ACTION, 150);
        myMovies[1] = movie2;

        Movie movie3 = new Movie("Home Alone", MovieGenre.DOCUMENTARY, 199, "Steven Spielberg");
        myMovies[2] = movie3;

        System.out.println("These are all the movies in your Movie List: ");
        System.out.println("---------------------------------------------");
       // Movie.printAllMovies(myMovies);

        System.out.println("These are all the books in your Books List: ");
        System.out.println("--------------------------------------------");
      //  Book.printAllBooks(myBooks);
        book1.printBookDetails();
        book2.printBookDetails();
        System.out.println(myMovies.);
    }
    }
/* book2.setTitle("Another Story");
        book2.setAuthor("Rina");
        book2.setPrice(987);
       */
/* book1.setTitle();
        book1.setAuthor();
        book1.setPrice();*/

/* //movie2.title = "Shark Attack 4";
        movie2.setTitle("Shark Attack five");
        movie2.setMovieGenre(MovieGenre.ACTION);
        movie2.setPrice(150);*/

/* movie1.setTitle("Hidden Figures");
        movie1.setMovieGenre(MovieGenre.DRAMA);
        movie1.setPrice(100);*/