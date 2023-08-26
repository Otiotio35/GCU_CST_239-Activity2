package app;
/**
 * I used some of the code given by my instructor for guide
 * 
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 */

import java.util.Random;

/**
 * Represents a superhero with a name, health, and alive/dead status.
 */
public class SuperHero {
    private String name;
    private int health;
    private boolean isDead;

    /**
     * Creates a new superhero with the specified name and health.
     *
     * @param name   The name of the superhero.
     * @param health The initial health of the superhero.
     */
    public SuperHero(String name, int health) {
        this.name = name;
        this.health = health;
        this.isDead = false;
    }

    /**
     * Attacks an opponent superhero and determines the damage and health after the attack.
     *
     * @param opponent The opponent superhero to attack.
     */
    public void attack(SuperHero opponent) {
        Random rand = new Random();
        int damage = rand.ints(1, (10 + 1)).findFirst().getAsInt(); 

        opponent.determineHealth(damage);

        System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage, opponent.health));
    }

    /**
     * Checks if the superhero is dead.
     *
     * @return true if the superhero is dead, otherwise false.
     */
    public boolean isDead() {
        return isDead;
    }

    /**
     * Determines the health of the superhero after taking damage.
     * 
     * @param damage The amount of damage to be subtracted from the superhero's health.
     */
    private void determineHealth(int damage) {
        if (this.health - damage <= 0) {
            this.health = 0;
            this.isDead = true;
        } else {
            this.health = this.health - damage;
        }
    }
}
