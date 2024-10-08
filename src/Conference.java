public class Conference extends Publication{

    private String conferenceNam;
    private String location;

    public Conference(String title, Author[] author, Publisher publisher, int year, String conferenceNam, String location) {
        super(title, author, publisher, year);
        this.conferenceNam = conferenceNam;
        this.location = location;
    }

    public String getConferenceNam() {
        return conferenceNam;
    }

    public void setConferenceNam(String conferenceNam) {
        this.conferenceNam = conferenceNam;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {

        String msg = null;
        msg += super.toString() + "how it is published in the conference of"
                +getConferenceNam() + "that is held " + getLocation()+ " in the year "+super.getYear();

        return msg;
    }


}
