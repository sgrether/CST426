public class Statue extends Entity {
    private int frames;
    private int delay;

    public Statue(int delay) {
        frames = 0;
        this.delay = delay;
    }

    public void update() {
        if(++frames == delay) {
            shootLightning();

            //Reset the timer
            frames = 0;
        }
    }

    private void shootLightning() {
        //shoot Lightning
        System.out.println("I'm shooting lightning");
    }
}
