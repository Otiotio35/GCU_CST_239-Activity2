package app;
/**
 * A test class for demonstrating and testing the functionalities of the Person class.
 * 
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 */
public class Test {
	/**
	 * Default constructor for the Test class.
	 */
	public Test() {
	    // No additional initialization logic for now.
	}
	

	/**
	 * The entry point of the Test application.
	
	 *
	 * @param args Command line arguments. 
	 */

	public static void main(String[] args) {

	    // Create new Person Objects
	    Person person1 = new Person("Justine", "Reha");
	    Person person2 = new Person("Brianna", "Reha");
	    Person person3 = new Person(person1);

	    // Test Object equality using ==
	    if (person1 == person2) {
	        System.out.println("These persons are identical using ==");
	    } else {
	        System.out.println("These persons are not identical using ==");
	    }

	    // Test Object equality using equals()
	    if (person1.equals(person2)) {
	        System.out.println("These persons are identical using equals()");
	    } else {
	        System.out.println("These persons are not identical using equals()");
	    }

	    // Test Copy Constructor
	    if (person1.equals(person3)) {
	        System.out.println("These copied person is identical using equals()");
	    } else {
	        System.out.println("These copied person is not identical using equals()");
	    }

	    // Print the Objects
	    System.out.println(person1);
	    System.out.println(person2.toString());
	    System.out.println(person3);
	}


}
