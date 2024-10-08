public class Journal {
    private String journalName;
    private int volume;
    private int issue;

    public Journal(String journalName, int volume, int issue) {
        this.journalName = journalName;
        this.volume = volume;
        this.issue = issue;
    }

    public Journal(String journalName) {
        this(journalName,1,1);
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {

        String msg = null;
        msg += "issue " + getIssue() + " of volume " +getVolume() + " of journal of " +getJournalName();

        return msg;
    }
}
