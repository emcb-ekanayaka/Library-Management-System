public class JournalArticle extends Publication{

    private Journal journal;

    public Journal getJournal() {
        return journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }

    public JournalArticle(String title, Author[] author, Publisher publisher, int year, Journal journal) {
        super(title, author, publisher, year);
        this.journal = journal;
    }

    @Override
    public String toString() {

        String msg = null;
        msg += super.toString() + " in fact it is journal article that is published in"
                + getJournal().toString() + " in year " + super.getYear();

        return msg;
    }
}
