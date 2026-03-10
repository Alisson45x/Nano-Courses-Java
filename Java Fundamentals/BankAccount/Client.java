package BankAccount;

/**
 * Represents a bank client with personal information.
 */
public class Client {

    /** The full name of the client. */
    String name;

    /** The age of the client. */
    int age;

    /**
     * Default constructor. Creates an empty client.
     */
    public Client() {
    }

    /**
     * Creates a client with the given information.
     *
     * @param name the full name of the client
     * @param age  the age of the client
     */
    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }
}