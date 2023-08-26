package app;
/**
 * I used some of the code given by my instructor for guide
 * 
 * @version 08/26/2023 ID: 21024608
 * @author toafik otiotio
 */
import java.util.Random;

/**
 * Simulates a game where Superman and Batman fight until one of them is defeated.
 */
public class Game {
    
    /**
     * The main method to run the game simulation.
     * 
     * @param args Command line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int health1 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
        int health2 = rand.ints(1, (1001 + 1 )).findFirst().getAsInt();

        System.out.println("Creating our Super Heroes ......");
        Superman superman = new Superman(health1);
        Batman batman = new Batman(health2);
        System.out.println("Super Heroes created");

        System.out.println("Running our game");
        while (!superman.isDead() && !batman.isDead()) {
            superman.attack(batman);
            batman.attack(superman);

            if (superman.isDead()) {
                System.out.println("Batman defeated Superman");
            }

            if (batman.isDead()) {
                System.out.println("Superman defeated Batman");
            }
        }
    }
}
