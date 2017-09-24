public class Particle {
    private  int framesLeft;
    private double x, y;
    private double xVel, yVel;

    //Constructor
    public Particle() {
        framesLeft = 0;
    }

    //Initialize a particle when it's needed
    public void init(double x, double y, double xVel, double yVel, int lifetime) {
        this.x = x;
        this.y = y;
        this.xVel = xVel;
        this.yVel = yVel;
        framesLeft = lifetime;
    }

    //Animate the particle
    public void animate() {
        if(!inUse()) return;

        framesLeft--;
        x += xVel;
        y += yVel;
    }

    //Check if the particle is in use
    public boolean inUse() {
        return framesLeft > 0;
    }
}
