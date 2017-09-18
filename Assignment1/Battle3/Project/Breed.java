public class Breed {
    private String breedName;
    private int health;
    private String attack = "";

    public Breed(String name, Breed parent, int health, String attack) {
        breedName = name;
        this.health = health;
        this.attack = attack;

        if (parent != null) {
            if(health == 0) this.health = parent.getHealth();
            if(this.attack == null) this.attack = parent.getAttack();
        }
    }

    public Monster newMonster() {
        return new Monster(this);
    }

    public int getHealth() {
        return health;
    }

    public String getAttack() {
        return attack;
    }

    public String getBreedName() {
        return breedName;
    }
}
