package battlearena;

public class Warrior extends Character {
    private boolean shieldActive = false;

    public Warrior(String name) {
        super(name, 120, 5, 15);
    }

    public boolean isShieldActive() {
        return shieldActive;
    }

    public void resetShield() {
        this.shieldActive = false;
    }

    @Override
    public int takeDamage(int amount) {
        if (shieldActive) {
            amount = amount / 2;
            shieldActive = false;
        }
        return super.takeDamage(amount);
    }

    @Override
    public String useSpecialAbility(Character target) {
        this.shieldActive = true;
        return getName() + " aktiverar Shield Block! Nästa inkommande skada halveras.";
    }

    @Override
    public String getCharacterType() {
        return "Warrior";
    }
}