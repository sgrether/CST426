import java.util.ArrayList;

public class TestPrototype {
    public static void main(String[] args) {
        Monster ghostPrototype = new Ghost(15, 3);
        Spawner ghostSpawner = new Spawner(ghostPrototype);
        ArrayList<Monster> averageGhost = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            averageGhost.add(ghostSpawner.spawnMonster());
        }
        System.out.println(averageGhost);

        ghostPrototype = new Ghost(3, 3);
        ghostSpawner = new Spawner(ghostPrototype);
        ArrayList<Monster> weakGhost = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            weakGhost.add(ghostSpawner.spawnMonster());
        }
        System.out.println(weakGhost);
    }
}
