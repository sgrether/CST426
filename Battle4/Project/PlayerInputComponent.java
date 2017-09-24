/**
 * Player Input Component
 * implements Abstract Input Component
 * Picks a random number between 0 and 1 to determine direction
 */

import java.util.Random;

public class PlayerInputComponent extends InputComponent {
    private final int WALK_ACCELERATION = 1;

    public void update(GameObject bjorn) {
        System.out.println("\n===== Input Component Updating =====");
        Random rand = new Random();
        int direction = rand.nextInt(2);
        switch (direction) {
            case 0:
                bjorn.setVelocity(bjorn.getVelocity() - WALK_ACCELERATION);
                System.out.println("Velocity changed to left.");
                break;
            case 1:
                bjorn.setVelocity(bjorn.getVelocity() + WALK_ACCELERATION);
                System.out.println("Velocity changed to right.");
                break;
        }
        System.out.println("===== Input Component Updated =====");
    }
}
