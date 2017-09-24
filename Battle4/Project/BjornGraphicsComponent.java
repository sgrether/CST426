/**
 * Bjorn Graphics Component
 * Implements Graphics Component
 * Updates the Sprites with the correct direction
 * Draws the updated sprites
 */

public class BjornGraphicsComponent extends GraphicsComponent{
    private Sprite spriteStand;
    private Sprite spriteWalkLeft;
    private Sprite spriteWalkRight;

    public BjornGraphicsComponent() {
        spriteStand = new Sprite("stand");
        spriteWalkLeft = new Sprite("left");
        spriteWalkRight = new Sprite("right");
    }

    public void update(GameObject bjorn, Graphics graphics) {
        System.out.println("\n===== Graphics Component Updating =====");
        Sprite sprite = spriteStand;
        if(bjorn.getVelocity() < 0) {
            sprite = spriteWalkLeft;
            System.out.println("Sprite changed to Walking Left.");
        } else if (bjorn.getVelocity() > 0) {
            sprite = spriteWalkRight;
            System.out.println("Sprite changed to Walking Right.");
        }

        graphics.draw(sprite, bjorn.getX(), bjorn.getY());
        System.out.println("===== Graphics Component Updated =====");
    }
}
