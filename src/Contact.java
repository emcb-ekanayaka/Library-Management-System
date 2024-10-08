public class Contact {

    private String email;
    private String telephone;
    private String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contact(String email, String telephone, String address) {
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public Contact(String email, String telephone) {
        this.email = email;
        this.telephone = telephone;
    }

    public Contact(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
