

public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String relationship;
    private String birthday;
    private String phoneNumber;

    // Default Constructor
    public Contact() {
        this.contactId = "";
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.address = "";
        this.relationship = "";
        this.birthday = "";
        this.phoneNumber = "";
    }
    
    // parameterized Constructor
    public Contact(String contactId, String firstName, String lastName, String email, String address, String relationship, String birthday, String phoneNumber) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.relationship = relationship;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString
    @Override
    public String toString() {
        return 
                "contactId='" + contactId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + address + '\'' +
                ", relationship='" + relationship + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber='" + phoneNumber + '\'';
    }


    // driver program
    public static void main(String[] args) {

        // using default constructor
        Contact myObj = new Contact();

        myObj.setContactId("1");
        myObj.setFirstName("John");
        myObj.setLastName("Doe");
        myObj.setEmail("johndoe@gmail.com");
        myObj.setAdress("123 Main St");
        myObj.setRelationship("Friend");
        myObj.setBirthday("01/01/2000");
        myObj.setPhoneNumber("123-456-7890");

        System.out.println(myObj.toString());

        // using parameterized constructor
        Contact myObj2 = new Contact("2", "Jane", "Doe", "janedoe@gmail.com", "456 Main St", "Friend", "01/01/2000", "123-456-7890");
        System.out.println(myObj2.toString());
        
       }
}



