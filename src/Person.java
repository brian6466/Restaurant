/**
 * Class to represent a person
 *
 * */
public class Person {
    private String name;
    private String email;
    private String number;

    /**
     * constructor
     * @param String number of person
     * @param String name of person
     */
    public Person(String number, String name) {
        this.setNumber(number);
        this.setName(name);
    }

    /**
     * gets number
     * @return String number of person
     */
    public String getNumber() {
        return number;
    }

    /**
     * sets number
     * @param String number of person
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * gets email
     * @return String email of person
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets email
     * @param String email of person
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * gets name
     * @return String name of person
     */
    public String getName() {
        return name;
    }

    /**
     * sets name
     * @param String name of person
     */
    public void setName(String name) {
        this.name = name;
    }
}