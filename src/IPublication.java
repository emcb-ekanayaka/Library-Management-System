public interface IPublication {
    String getTitle();
    void setTitle(String title);

    Author[] getAuthor();
    void setAuthor(Author[] author);

    int getYear();
    void setYear(int year);

    Publisher getPublisher();
    void setPublisher(Publisher publisher);
}
