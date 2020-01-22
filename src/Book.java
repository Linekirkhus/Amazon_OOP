public class Book implements Product{

    protected String title;
    protected String author;
    protected int price;
    protected long productId;



    public Book(String title, String author, int price, long productId) {

        this.title = title;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   /* public int getPrice() {
        return price;
    }
*/
  /*  public void setPrice(int price) {
        this.price = price;
    }
*/
    @Override
    public String toString() {
        return "Book: " +
                "\nTitle: " + title + '\'' +
                "\nAuthor: " + author + '\'' +
                "\nPrice: " + price +
                "\nProductId: " + productId;
    }

    @Override
    public void printDetails() {
        System.out.println("The title of this book is: " + this.title);
        System.out.println("The author of this book is: " + this.author);
        System.out.println("The price of this book is: " + this.price + "\n");
    }

}





   /* public static void printAllBooks(Book[] myBooks){

        for (int i = 0; i < myBooks.length; i++) {
            Book book = myBooks[i];
            // printBookDetails(book);
                 book.printBookDetails();
        }

    }*/


