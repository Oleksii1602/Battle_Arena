package battlearena;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 100, 10, 16);
    }

    @Override
    public String useSpecialAbility(Character target) {
        int bowDamage = 22;
        int damageDone = target.takeDamage(bowDamage);
        return getName() + " utför Backstab och gör " + damageDone + " kritisk skada på " + target.getName() + "!";
    }

    @Override
    public String getCharacterType() {
        return "Rogue";
    }
}