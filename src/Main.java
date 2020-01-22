import java.util.*;

public class Main {

    public static List<Book> myBooks = new ArrayList<>();
    public static List<Movie> myMovies = new ArrayList<>();

    public static void main(String[] args) {

        Book book1 = new Book("My Story", "Line K", 145, 875678L);
        myBooks.add(book1);

        Book book2 = new Book("Another Story", "Rina", 987, 674452L);
        myBooks.add(book2);

        Book childrensBook = new Book("My Little Pony", "Marit", 345, 936519L);
        myBooks.add(childrensBook);

        Movie movie1 = new Movie("Hidden Figures", MovieGenre.DRAMA, 100, 512345L);
        myMovies.add(movie1);


        Movie movie2 = new Movie("Shark attack Five", MovieGenre.ACTION, 150, 234564L);
        myMovies.add(movie2);

        MovieWithDirector movie3 = new MovieWithDirector("Home Alone", MovieGenre.DOCUMENTARY, 199, "Steven Spielberg", 634567L);
        myMovies.add(movie3);


        System.out.println("This movie: " + findMovieById(253456L, myMovies));

        // Lag print menu metode...
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------  WELCOME TO AMAZON -----------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("These are all the individual movies in your Movie List: ");
        System.out.println("-----------------------------------------------------");
        movie1.printDetails();
        System.out.println("-----------------------------------------------------");
        movie2.printDetails();
        System.out.println("-----------------------------------------------------");
        movie3.printDetails();
        System.out.println("-----------------------------------------------------");
        System.out.println("These are all the movies in your Movie List: ");
        System.out.println("-----------------------------------------------------");
        printAllMovies(myMovies);
        System.out.println();
        // printAllMovies(myMovies);

        System.out.println("-----------------------------------------------------");
        System.out.println("These are all the individual books in your Books List: ");
        System.out.println("----------------------------------------------------");
        //  Book.printAllBooks(myBooks);
        book1.printDetails();
        System.out.println("-----------------------------------------------------");
        book2.printDetails();
        System.out.println("-----------------------------------------------------");
        System.out.println("These are all the books in your Books List: ");
        System.out.println("----------------------------------------------------");
        printAllBooks(myBooks);
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("------------------   THE END   ----------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println(book1.toString());

        long searchId = 321;
        Movie m1 = findMovieById(searchId, myMovies);
        if (m1 != null) {
            System.out.println("Found this Movie: ");
            assert m1 != null;
            m1.printDetails();
        } else {
            System.out.println("Didn't find a movie with productId: " + searchId);
        }


        // Task 4
        Map<Long, Movie> movieMap = new HashMap<>();
        movieMap.put(movie1.getProductId(), movie1);
        movieMap.put(movie2.getProductId(), movie2);
        movieMap.put(movie3.getProductId(), movie3);

        long searchId2 = 222;
        Movie m2 = movieMap.get(searchId2);
        if (m2 != null) {
            System.out.println("Found this movie in map: ");
            m2.printDetails();
        } else {
            System.out.println("Didn't find a movie with productId in map: " + searchId2);
        }
        List<Product> myProducts = new ArrayList<>();
        myProducts.add(book1);
        myProducts.add(book2);
        myProducts.add(childrensBook);
        myProducts.add(movie1);
        myProducts.add(movie2);
        myProducts.add(movie3);

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------Printing MyMovies-------------------");
        System.out.println("-----------------------------------------------------\n");

        for (Product p : myProducts) {
            p.printDetails();
        }


        List<Movie> sortedMovieList = new ArrayList<>();
        sortedMovieList.add(movie1);
        sortedMovieList.add(movie2);
        sortedMovieList.add(movie3);

        myProducts.addAll(sortedMovieList);

        Collections.sort(sortedMovieList);

        System.out.println("-----------------------------------------------------");
        System.out.println("--------------Printing Sorted Movies-----------------");
        System.out.println("-----------------------------------------------------\n");
        for (Product p : sortedMovieList) {
            p.printDetails();
        }
    }


    private static Movie findMovieById(long productId, List<Movie> myMovie) {

        for (Movie movie : myMovie) {
            if (movie.getProductId() == productId) {
                return movie;
            }
        }
        return null;
    }

    static void printAllBooks(List<Book> myBooks) {
        for (Book books : myBooks) {
            books.printDetails();
        }
    }

    public static void printAllMovies(List<Movie> myMovie) {

        for (int i = 0; i < myMovie.size(); i++) {
            myMovie.get(i).printDetails();
        }
    }

}

