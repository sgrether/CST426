/**
 * Game Object
 * Acts as Component holder
 * Updates all held components
 */

public class GameObject {
    private int velocity;
    private int x, y;
    private InputComponent input;
    private PhysicsComponent physics;
    private GraphicsComponent graphics;

    //Create GameObject
    public GameObject(InputComponent input, PhysicsComponent physics, GraphicsComponent graphics) {
        velocity = 0;
        x = y = 0;
        this.input = input;
        this.physics = physics;
        this.graphics = graphics;
    }

    //Update GameObject by updating each component
    public void update(World world, Graphics graphics) {
        input.update(this);
        physics.update(this, world);
        this.graphics.update(this, graphics);
    }

    public int getVelocity() {
        return velocity;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
