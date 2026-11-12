package battlearena;

import java.util.Random;

public abstract class Character implements SpecialAbility {
    private String name;
    private int hp;
    private int maxHp;
    private int minDamage;
    private int maxDamage;
    protected Random random = new Random();

    public Character(String name, int maxHp, int minDamage, int maxDamage) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    protected void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else if (hp > maxHp) {
            this.hp = maxHp;
        } else {
            this.hp = hp;
        }
    }

    public int takeDamage(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        int actualHp = Math.max(0, this.hp - amount);
        this.hp = actualHp;
        return amount;
    }

    public void heal(int amount) {
        if (amount > 0) {
            setHp(this.hp + amount);
        }
    }

    public int attack(Character target) {
        int damage = random.nextInt(maxDamage - minDamage + 1) + minDamage;
        return target.takeDamage(damage);
    }

    public abstract String getCharacterType();
}