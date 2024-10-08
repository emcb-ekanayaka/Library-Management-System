public class FullPaper extends AbstractPaper{

    private String pages;

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public FullPaper(String title, Author[] author, Publisher publisher, int year, String keywords, String pages) {
        super(title, author, publisher, year, keywords);
        setPages(pages);
    }

    @Override
    public String toString() {

        String msg = null;
        msg += super.toString() + "However the the full paper is in pages from " +getPages() ;

        return msg;
    }
}
