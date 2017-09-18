public class Skeleton extends Entity {
    boolean patrollingLeft;

    public Skeleton() {
        patrollingLeft = false;
    }

    public void update() {
        if(patrollingLeft) {
            setX(getX() - 1);
            if(getX() == 0) patrollingLeft = false;
            System.out.println("I'm patrolling left.");
        } else {
            setX(getX() + 1);
            if (getX() == 100) patrollingLeft = true;
            System.out.println("I'm patrolling right.");
        }
    }
}
