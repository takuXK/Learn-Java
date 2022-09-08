package Test_Demo_Object_Forward.Combat_Game;

// 用于创建格斗角色的JavaBean类

import java.util.Random;

public class Role {
    private String rolename;
    private int blood;
    private int attack;
    private int defense;
    private int speed;

    public Role() {
    }

    public Role(String rolename, int blood, int attack, int defense, int speed) {
        this.rolename = rolename;
        this.blood = blood;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // attack method
    public int Attack() {
        Random rand = new Random();
        int attack = rand.nextInt(this.attack) + 1;
        return attack;
    }
    // defend method
    public int Defense() {
        Random rand = new Random();
        int defense = rand.nextInt(this.defense) + 1;
        return defense;
    }
    // final battle result
    public void BattleResult(Role role, int attack, int defense) {
        int hurt = attack > defense? attack - defense: 0;
        int remain = role.getBlood() - hurt;
        remain = remain > 0? remain: 0;
        role.setBlood(remain);
        System.out.printf("%s beats %s, leads to %d damage, but %s defends %d damage, so %s remains %d hp now.\n",
                this.getRolename(), role.getRolename(), attack,
                role.getRolename(), defense, role.getRolename(), role.getBlood());
    }
}
