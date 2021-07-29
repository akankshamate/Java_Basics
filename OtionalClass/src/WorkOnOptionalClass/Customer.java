package WorkOnOptionalClass;

import java.util.List;

import java.util.Optional;

/**
 * @author akanksha
 * {@code Customer} have some getter and setter methods and one constructor
 *
 */
public class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;

    /**
     * 
     * @param id
     * @param name
     * @param email
     * @param phoneNumbers
     */
    public Customer(int id, String name, String email, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
    }
    
    /**
     * 
     * @return integer id of a customer
     */
    public int getId() {
        return id;
    }

    /**
     * setId(int) method sets the value for id in particular objects.   
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return name of a customer
     */
    public String getName() {
        return name;
    }

    /**
     * setId(String) method sets the value for name in particular objects.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return email address of a customer as an Object 
     */
    public Object getEmail() {
        return email;
    }

    /**
     * setId(String) method sets the value of email in particular objects.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 
     * @return list of phoneNumbers of a customer
     */
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * setId(List<String>) method sets the value for multiple phone numbers in particular objects.
     * @param phoneNumbers
     */
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
