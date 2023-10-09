package Units;

class Monster extends Creatures{

    private int maxHealth;
    public Monster() throws InvalidValueException {
        super();
        this.maxHealth = 100;
    }

    public Monster(int attack, int defense, int health, int damage) throws InvalidValueException {
        super(attack, defense, health, damage);
        this.maxHealth = 100;
    }

}
