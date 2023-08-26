package app;

/**
 * The Bomb class represents a specific type of weapon. It extends the Weapon class and 
 * provides implementations for firing the weapon and activating it.
 * 
 *  @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 * @see Weapon
 */
public class Bomb extends Weapon {
	

    /**
     * Default constructor for the Bomb class.
     */
    public Bomb() {
        // Intentionally left empty.
    }

    /**
     * Fires the bomb with the given power. This method prints out the class name, 
     * method name, and the specified power.
     * 
     * @param power the intensity or magnitude with which the bomb is triggered
     */
    @Override
    public void fireWeapon(int power) {
        System.out.println("Class Name: " + this.getClass().getSimpleName());
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Power: " + power);
    }

    /**
     * Overloaded version of the fireWeapon method that uses a default power value.
     * This method prints out the class name and method name, then calls the base 
     * class's fireWeapon method with a default power.
     */
    public void fireWeapon() {
        System.out.println("Class Name: " + this.getClass().getSimpleName());
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        super.fireWeapon(10);  // Call to the base class's method
    }

    /**
     * Activates or deactivates the bomb. This method prints out the class name, 
     * method name, and the activation status.
     * 
     * @param enable a boolean indicating whether to activate (true) or deactivate (false) the bomb
     */
    @Override
    public void activate(boolean enable) {
        System.out.println("Class Name: " + this.getClass().getSimpleName());
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("Enable: " + enable);
    }  
}
