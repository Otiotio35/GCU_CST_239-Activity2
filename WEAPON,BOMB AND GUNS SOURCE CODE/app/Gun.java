package app;
/**
 * it just relies on the fireWeapon method from the superclass.
 *
 * I used some of the code given by my instructor for guide
 * 
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 * @see Weapon
 */

public class Gun extends Weapon {
	

@Override
public void fireWeapon(int power) {
    System.out.println("Class Name: " + this.getClass().getSimpleName());
    System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    System.out.println("Power: " + power);
}

//Overloaded method
public void fireWeapon() {
    System.out.println("Class Name: " + this.getClass().getSimpleName());
    System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    super.fireWeapon(5);  // Call to the base class's method
}
@Override
public void activate(boolean enable) {
    System.out.println("Class Name: " + this.getClass().getSimpleName());
    System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    System.out.println("Enable: " + enable);
}
}

