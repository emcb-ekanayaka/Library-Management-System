public class AbstractPaper extends Publication {

    private String keywords;

    public AbstractPaper(String title, Author[] author, Publisher publisher, int year, String keywords) {
        super(title, author, publisher, year);
        this.keywords = keywords;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {

        String msg = null;
        msg += super.toString() + "However the keywords of the abstract are " +getKeywords() ;

        return msg;
    }
}
