package OOPs.Constructor_Example_project.timbuchalka;

/**
 * Created by dev on 2/07/15.
 */
public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson() {
        // press ctrl and click on 'this' keyword to navigate on constructor which is called
        this("Default name", 50000.00, "default@email.com");
    }
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
