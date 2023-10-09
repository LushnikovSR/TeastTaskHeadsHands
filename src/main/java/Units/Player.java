package Units;

class Player extends Creatures{
    private final int HEALLIMIT = 4;
    private int maxHealth;
    private int healCounter;
    public Player() throws InvalidValueException{
        super();
        this.maxHealth = 150;
        this.healCounter = 0;

    }

    public Player(int attack, int defense, int health, int damage) throws InvalidValueException{
        super(attack, defense, health, damage);
        this.maxHealth = 150;
        this.healCounter = 0;
    }

    protected void heal() {
        if (healCounter < HEALLIMIT & this.health > 0){
            this.health = this.health + (int)(maxHealth * 0.3);
            if (this.health > maxHealth){
                this.health = maxHealth;
            }
        }

    }

}
