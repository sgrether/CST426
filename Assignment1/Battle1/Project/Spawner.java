public class Spawner {
    private Monster prototype_;

    public Spawner(Monster prototype_) {
        this.prototype_= prototype_;
    }

    public Monster spawnMonster() {
        return prototype_.clone();
    }
}
