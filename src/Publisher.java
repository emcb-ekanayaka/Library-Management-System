public class Publisher {

    private String publisherName;
    private Contact contact;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Publisher(String publisherName, Contact contact) {
        this.publisherName = publisherName;
        this.contact = contact;
    }

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    public Publisher() {
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                ", contact=" + contact +
                '}';
    }
}
