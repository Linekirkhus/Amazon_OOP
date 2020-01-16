public class Book {

    private String title;
    private String author;
    private int price;


    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   /* public static void printAllBooks(Book[] myBooks){

        for (int i = 0; i < myBooks.length; i++) {
            Book book = myBooks[i];
            // printBookDetails(book);
                 book.printBookDetails();
        }

    }*/
    public void printBookDetails() {

        System.out.println("The title of this book is: " + this.title);
        System.out.println("The author of this book is: " + this.title);
        System.out.println("The price of this book is: " + this.title + "\n");
    }

}






