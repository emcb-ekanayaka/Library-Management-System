import java.util.Scanner;

public class LibraryManagementSystem {

    public static final int MAX_PUBLICATIONS = 100;
    public static void main(String[] args) {

        Publication[] publication;
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMainMenu();
            choice = scanner.nextInt();

            switch (choice){
                case 1:inputContacts(); break;
                case 2:inputAuthor(); break;
                case 3:inputPublisher(); break;
                case 4:inputBook(); break;
                case 5: break;
                default:
                    System.out.println("Invalid Number");
            }

        }while (choice<=4);

    }

    public static void printMainMenu(){
        System.out.println(" Main Menu ");
        System.out.println(" --------- ");
        System.out.println("(1) Add Contact Details ");
        System.out.println("(2) Add Author ");
        System.out.println("(3) Add Publications ");
        System.out.println("(4) Add Book ");
        System.out.println("(5) Exit ");

        System.out.println("Enter your Choice 1-5 ");
    }

    public static Contact inputContacts(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Email : ");
        String email = sc.next();

        System.out.println("Enter Telephone : ");
        String telephone = sc.next();

        System.out.println("Enter Address : ");
        String address = sc.next();

        Contact contact = new Contact(email,telephone,address);
        return contact;

    }

    public static Author inputAuthor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Author Name : ");
        String authorName = sc.next();

        System.out.println("Enter Contact Details : ");

        Contact contact = inputContacts();
        Author author = new Author(authorName,contact);
        return author;
    }

    public static Publisher inputPublisher(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Publisher Name : ");
        String publisherName = sc.next();

        System.out.println("Enter Contact Details : ");

        Contact contact = inputContacts();
        Publisher publisher = new Publisher(publisherName,contact);
        return publisher;
    }

    public static Book inputBook(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Title of the Book : ");
        String bookTitle = sc.next();

        System.out.println("Enter Author Details : ");
        Author author = inputAuthor();

        System.out.println("Enter ISBN : ");
        String isbn = sc.next();

        System.out.println("Enter Edition : ");
        String edition = sc.next();

        System.out.println("Enter Year of publish : ");
        int year = sc.nextInt();

        System.out.println("Enter Publisher Details : ");
        Publisher publisher = inputPublisher();

        System.out.println("Enter Price of book : ");
        double price = sc.nextDouble();

        Author[] authors = {author};

        Book book = new Book(bookTitle,authors,publisher,year,isbn,edition,price);

        return book;
    }

    public static void printPublications(Publication[] pubs){

       for (Publication publication: pubs){
           System.out.println(pubs.toString());
        }
    }
}
