public class Book extends Publication{

    private String ISBN;
    private String edition;
    private double price;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price>=0){
            this.price = price;
        }else {
            System.out.println("The price can not be negative");
        }

    }

    public Book(String title, Author[] author, Publisher publisher, int year, String ISBN, String edition, double price) {
        super(title, author, publisher, year);
        this.ISBN = ISBN;
        this.edition = edition;
        this.price = price;
    }

    public Book(String title, Author[] author, Publisher publisher, int year, String ISBN, String edition) {
        this(title,author,publisher,year,ISBN,edition,0.0);
    }

    @Override
    public String toString() {

        String msg = null;
        msg += super.toString() + "In fact , it is the "+ getEdition() + " edition of the book published under the ISBN"
                +getISBN() + "in year " + getYear()+ " worth Rs."+getPrice();

        return msg;
    }
}
