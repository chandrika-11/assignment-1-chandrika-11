package person;
import contacts.ContactList;

public class Person {
    private String firstName;
    private String lastName;
    private ContactList ContactList;
    private String emailAddress;

    public Person(String firstName, String lastName, ContactList contactList, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ContactList = contactList;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactList getContactList() {
        return ContactList;
    }

    public void setContactList(ContactList contactList) {
        this.ContactList = contactList;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


}
