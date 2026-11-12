package battlearena;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 90, 8, 18);
    }

    @Override
    public String useSpecialAbility(Character target) {
        int healAmount = 25;
        int oldHp = getHp();
        heal(healAmount);
        int actualHeal = getHp() - oldHp;
        return getName() + " kastar Heal Spell och återfår " + actualHeal + " HP!";
    }

    @Override
    public String getCharacterType() {
        return "Mage";
    }
}
