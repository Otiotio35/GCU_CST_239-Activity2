package app;
/**
* Represents the main game class responsible for initializing and managing the game's flow.
*  
*  @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 */

public class Game {
	 /**
     * Default constructor for the Game class.
     */
    public Game() {
       
    }
	  /**
     * The main entry point for the Game application.
     * 
     * @param args Command-line arguments passed to the application.
     */

    public static void main(String[] args) {
    	 // Create an instance of Bomb
        Bomb weapon1 = new Bomb();
        weapon1.activate(true);
        weapon1.fireWeapon(10);  // Call fireWeapon method with power 10
        weapon1.fireWeapon();    // Call overloaded fireWeapon method

        // Create an instance of Gun
        Gun weapon2 = new Gun();
        weapon2.activate(true);
        weapon2.fireWeapon(5);   // Call fireWeapon method with power 5
        weapon2.fireWeapon();    // Call overloaded fireWeapon method fireWeapon method with power 5
    }
}

