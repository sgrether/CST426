import java.util.ArrayList;

public class ParticlePool {
    private final int POOL_SIZE = 100;
    ArrayList<Particle> particles;

    //Constructor
    public ParticlePool() {
        //Initialize all particles
        particles = new ArrayList<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            particles.add(new Particle());
        }
    }

    //Create a particle using the first one available
    public void create(double x, double y, double xVel, double yVel, int lifetime) {
        for(int i = 0; i < POOL_SIZE; i++) {
            if(!particles.get(i).inUse()) {
                particles.get(i).init(x, y, xVel, yVel, lifetime);
                return;
            }
        }
    }

    //Animate each particle in the pool
    //Call every frame
    public void animate() {
        for (int i = 0; i < particles.size(); i++) {
            particles.get(i).animate();
        }
    }

    public String toString() {
        int count = 0;
        StringBuilder str = new StringBuilder(POOL_SIZE + " particles.\n");
        for(int i = 0; i < POOL_SIZE; i++) {
            if(particles.get(i).inUse()) {
                count++;
            }
        }
        str.append(count + " particles currently in use.");
        return str.toString();
    }
}
