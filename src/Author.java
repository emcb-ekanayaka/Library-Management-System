public class Author {

    private String authorName;
    private Contact contact;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Author(String authorName, Contact contact) {
        setAuthorName(authorName);
        setContact(contact);
    }

    public Author(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        if (contact == null){
            String msg = null;
            msg += "The author " + getAuthorName() + " and he/she not given the contact details";
            return msg;
        }else {
            String msg = null;
            msg += "The author " + getAuthorName() + " and he/she contact details" +getContact();
            return msg;
        }
    }
}
