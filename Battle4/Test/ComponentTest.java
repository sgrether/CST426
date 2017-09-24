public class ComponentTest {
    public static void main(String[] args) {
        World world = new World();
        Graphics graphics = new Graphics();
        GameObject bjorn = new GameObject(new PlayerInputComponent(), new BjornPhysicsComponent(), new BjornGraphicsComponent());
        System.out.println("===== Bjorn Game Object Created =====");
        System.out.println("\n===== Calling Update on Bjorn Game Object =====");
        bjorn.update(world, graphics);
    }
}
