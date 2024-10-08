public class PosterPresentation extends Conference{

    private String presenterName;

    public String getPresenterName() {
        return presenterName;
    }

    public void setPresenterName(String presenterName) {
        this.presenterName = presenterName;
    }

    public PosterPresentation(String title, Author[] author, Publisher publisher, int year, String conferenceNam, String location, String presenterName) {
        super(title, author, publisher, year, conferenceNam, location);
        this.presenterName = presenterName;
    }

    @Override
    public String toString() {

        String msg = null;
        msg += super.toString() + "In fact in oral representation presented by 6x4";

        return msg;
    }
}
