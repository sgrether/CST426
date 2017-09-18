public class TestTypeObject {
    public static void main(String[] args) {
        Breed troll = new Breed("Troll",null, 25, "The troll hits you!");
        Breed trollArcher = new Breed("Troll Archer", troll, 0, "The troll archer fires an arrow!");
        Breed trollWizard = new Breed("Troll Wizard", troll, 0, "The troll wizard casts a spell on you!");

        Monster m1 = troll.newMonster();
        Monster m2 = trollArcher.newMonster();
        Monster m3 = trollWizard.newMonster();
        Monster m4 = trollWizard.newMonster();

        System.out.println(m1);
        System.out.println(m1.getAttack());
        System.out.println();

        System.out.println(m2);
        System.out.println(m2.getAttack());
        System.out.println();

        System.out.println(m3);
        System.out.println(m3.getAttack());
        System.out.println();

        m4.setHealth(15);
        System.out.println(m4);
    }
}
