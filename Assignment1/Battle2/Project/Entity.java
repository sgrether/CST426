public abstract class Entity {
    private double x;
    private double y;

    public Entity() {
        x = 0;
        y = 0;
    }

    abstract void update();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
