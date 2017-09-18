public class Ghost implements Monster{
    private int health;
    private int speed;

    public Ghost(int health, int speed) {
        this.health = health;
        this.speed = speed;
    }

    @Override
    public Monster clone() {
        return new Ghost(health, speed);
    }

    @Override
    public String toString() {
        return "Ghost - Health: " + health + ", Speed: " + speed + ".\n";
    }
}
