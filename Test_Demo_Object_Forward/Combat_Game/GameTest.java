package Test_Demo_Object_Forward.Combat_Game;

// 文字格斗游戏

public class GameTest {
    public static void main(String[] args) {
        // create roles
        Role r1 = new Role("qiaofeng", 100, 30, 30, 1);
        Role r2 = new Role("jiumozhi", 100, 40, 15, 2);
        // compare speed
        Role[] order = SpeedCompare(r1, r2);
        // battle process
        Battle(order[0], order[1]);
    }
    // speed compare
    public static Role[] SpeedCompare(Role r1, Role r2) {
        Role prior = r1.getSpeed() >= r2.getSpeed()? r1: r2;
        Role latt = r1.getSpeed() < r2.getSpeed()? r1: r2;
        Role[] order = {prior, latt};
        return order;
    }
    // battle method
    public static void Battle(Role r1, Role r2) {
        int round = 1;
        while (true) {
            System.out.println("Round " + round + ":");
            int attack1 = r1.Attack();
            int defense1 = r2.Defense();
            r1.BattleResult(r2, attack1, defense1);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getRolename() + " K.O " + r2.getRolename());
                break;
            }

            int attack2 = r2.Attack();
            int defense2 = r1.Defense();
            r2.BattleResult(r1, attack2, defense2);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getRolename() + " K.O " + r1.getRolename());
                break;
            }
            round++;
        }
    }
}
