package app;

/**
 * Represents a person with a first and last name.
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio 
 */
public class Person {

    // Private class member variables
    private String firstName = "Mark";
    private String lastName = "Reha";

    /**
     * Non-default constructor to initialize the firstName and lastName.
     *
     * @param firstName the first name of the person
     * @param lastName  the last name of the person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Copy constructor to initialize the firstName and lastName from another Person object.
     *
     * @param person the person object to be copied
     */
    public Person(Person person) {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
    }

    /**
     * Getter for firstName.
     *
     * @return the first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for lastName.
     *
     * @return the last name of the person
     */
    public String getLastName() {
        return lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            System.out.println("I am here in other == this");
            return true;
        }

        if (other == null) {
            System.out.println("I am here in other == null");
            return false;
        }

        if (getClass() != other.getClass()) {
            System.out.println("I am here in getClass() != other.getClass()");
            return false;
        }

        Person person = (Person)other;
        return (this.firstName == person.firstName && this.lastName == person.lastName);
    }
    @Override
    public String toString() {
        return "My class is " + getClass().getSimpleName() + " " + firstName + " " + lastName;
    }

}

