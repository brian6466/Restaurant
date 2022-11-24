
public class Staff extends Person {

    private int salary;

    /**
     * constructor
     * @param number (String number)
     * @param name (String name)
     * @param salary (integer salary)
     */
    public Staff(String number, String name, int salary) {
        super(number, name);
        this.setSalary(salary);
    }

    /**
     * gets salary
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * sets salary
     * @param salary (integer salary)
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
