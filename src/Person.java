
public class Person {
    private String name;
    private String email;
    private String number;

    /**
     * constructor
     * @param number
     * @param name
     */
    public Person(String number, String name) {
        this.setNumber(number);
        this.setName(name);
    }

    /**
     * gets number
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * sets number
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * gets email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * gets name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * sets name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
}
