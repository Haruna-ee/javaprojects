public class Customer {
    private Long customerID;
    private String name;
    private String phonenumber;
    private String emailaddress;

    public String getName() {
        return name;
    }
// public void setName (String name){
//        this.name = name;
// }

    public Long getcustomerID() {
        return customerID;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public Customer(Long customerID, String name, String phonenumber, String emailaddress) {
        this.customerID = customerID;
        this.name = name;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }
}
