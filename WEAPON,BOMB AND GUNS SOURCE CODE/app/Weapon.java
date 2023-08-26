package app;
/**
 * Represents an abstract weapon with common functionalities.
 *
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 */

public abstract class Weapon {

	protected Weapon() {
		// Default constructor, intentionally left empty.
	}
	/**
     * Activates or deactivates the weapon based on the provided argument.
     *
     * @param enable If true, the weapon will be activated; if false, it will be deactivated.
     */
	public abstract void activate(boolean enable);
	
    /**
     * Fires the weapon with the specified power.
     * 
     * @param power The power with which the weapon is to be fired.
     */
    public void fireWeapon(int power) {
		System.out.println("Class Name: " + this.getClass().getSimpleName());
		System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println("Power: " + power);
	}
}
