public class Monster {
    private int health;
    Breed breed;

    public Monster(Breed breed) {
        this.breed = breed;
        health = breed.getHealth();
    }

    public String getAttack() {
        return breed.getAttack();
    }

    @Override
    public String toString() {
        return "Breed: " + breed.getBreedName() + ", Health: " + health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
