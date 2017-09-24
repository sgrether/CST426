/**
 * Bjorn Physics Component
 * Implements Abstract Physics Component
 * Updates Bjorn's velocity
 * Calls World to resolve collisions
 */

public class BjornPhysicsComponent extends PhysicsComponent{
    private Volume volume;

    public BjornPhysicsComponent() {
        volume = new Volume();
    }

    public void update(GameObject bjorn, World world) {
        System.out.println("\n===== Physics Component Updating =====");
        bjorn.setX(bjorn.getX() + bjorn.getVelocity());
        world.resolveCollision(volume, bjorn.getX(), bjorn.getY(), bjorn.getVelocity());
        System.out.println("===== Physics Component Updated =====");
    }
}
