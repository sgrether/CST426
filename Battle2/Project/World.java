import java.util.ArrayList;

public class World {
    private ArrayList<Entity> entities;

    public World() {
        entities = new ArrayList<>(0);
    }

    public void gameLoop() {
        while(true) {
            //User input

            //Update each entity
            for (int i = 0; i < entities.size(); i++) {
                entities.get(i).update();
            }
            //Physics / Rendering
        }
    }

    public void addEntities(Entity e) {
        entities.add(e);
    }
}
