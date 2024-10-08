import java.util.Arrays;

public abstract class Publication implements IPublication {

    private String title;
    private Author[] author;
    private Publisher publisher;
    private int year;

    public Publication(String title, Author[] author, Publisher publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Author[] getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(Author[] author) {
        this.author = author;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {

        String msg = null;
        msg += "The publication " + getTitle() + " is  written by " + getAuthor()[0].toString() + " it is published by " +
        getPublisher().toString();

        return msg;
    }
}
