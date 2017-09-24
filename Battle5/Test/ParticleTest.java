public class ParticleTest {
    public static void main(String[] args) {
        ParticlePool pool = new ParticlePool();
        System.out.println("===== Particle Pool Created =====");
        System.out.println(pool);

        System.out.println("\n===== Grabbing 10 Particle =====");
        for(int i = 0; i < 10; i++) {
            pool.create(5, 5, 2, 2, i+5);
        }
        System.out.println(pool);

        System.out.println("\n===== After Animating 10 Frames =====");
        for(int i = 0; i < 10; i++) {
            pool.animate();
        }

        System.out.println(pool);
    }
}
