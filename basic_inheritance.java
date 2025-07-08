/* Assignment
Assume the following Person class has been defined. The Person class holds data about a person. Specifically, it holds a person's name, address, and telephone number.

public class Person
 {
    private String name;
    private String address;
    private String number;

    public Person(String n, String a, String num) 
    {
        name = n;
        address = a;
        number = num;
    }

    public String getName() 
   {
        return name;
    }

    public String getAddress() 
    {
        return address;
    }

    public String getNumber() 
    {
        return number;
    }

    public void setName(String n) 
   {
        name = n;
    }

    public void setAddress(String a) 
    {
        address = a;
    }

    public void setNumber(String n) 
    {
        number = n;
    }
}
Write a public class named Customer, which is a subclass of the Person class. The Customer class should have the following fields:

customerNumber, a String to hold a customer number
receiveMail, a boolean to indicate whether the customer wishes to be on a mailing list
The Customer class should also have a constructor that accepts five arguments, in the following order:

A String for the customer's name
A String for the customer's address
A String for the customer's telephone number
A String for the customer's customer number
A boolean to indicate whether the customer wishes to be on a mailing list
The constructor should pass the first three arguments to the superclass constructor and use the last two arguments to initialize the customerNumber and receiveMail fields.

In addition, the Customer class should have public accessor methods and public mutator methods for each of the class's fields.

*/

public class Customer extends Person {
    String customerNumber;
    boolean receiveMail;

    public Customer(String n, String a, String num, String custNum, boolean mailingListElection){
        super(n, a, num);
        // this.name = n;
        // this.address = a;
        // this.number = num;
        this.customerNumber = custNum;
        this.receiveMail = mailingListElection;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public boolean getReceiveMail() {
        return this.receiveMail;
    }

    public void setCustomerNumber(String num) {
        this.customerNumber = num;
    }

    public void setReceiveMail(boolean election) {
        this.receiveMail = election;
    }
}
