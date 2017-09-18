public class TestUpdateMethod {
    public static void main(String[] args) {
        World game = new World();
        game.addEntities(new Skeleton());
        game.addEntities(new Statue(200));

        game.gameLoop();
    }
}
