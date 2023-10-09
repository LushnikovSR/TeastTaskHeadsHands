package Units;

import java.util.Random;

abstract public class Creatures{
    private int attack;
    private int defense;
    protected int health;
    private int damage;
    public boolean isLive;

    public Creatures(int attack, int defense, int health, int damage) throws InvalidValueException {
        if (attack < 1 | attack > 30)
            throw new InvalidValueException("Некорректное количество очков атаки: ", attack);
        this.attack = attack;
        if (defense < 1 | defense > 30)
            throw new InvalidValueException("Некорректное количество очков защиты: ", defense);
        this.defense = defense;
        if (health < 1)
            throw new InvalidValueException("Некорректное количество очков здоровья: ", health);
        this.health = health;
        if (damage < 1 | damage > 6)
            throw new InvalidValueException("Некорректное количество очков урона: ", damage);
        this.damage = damage;
        this.isLive = true;
    }

    public Creatures() {
        Random random = new Random();
        this.attack = random.nextInt(1, 31);
        this.defense = random.nextInt(1, 31);
        this.health = random.nextInt(101);
        this.damage = random.nextInt(1, 7);
        this.isLive = true;
    }

    public void attack(Creatures target){
        if (this.health <= 0){
            this.isLive = false;
            return;
        }
        int modAttack = this.attack - target.defense + 1;
        Random random = new Random();
        for(int i = 1; i <= modAttack; i++){
            int dice = random.nextInt(1,7);
            if (dice > 4){
                int randDamage = random.nextInt(this.damage + 1);
                target.health = target.health - randDamage;
            }
        }
    }

    public String getInfo(){
        return String.format("N: %s \u2661: %d \u2694: %d Def: %d At: %d", this.getClass().getSimpleName(),
                this.health, this.damage, this.defense, this.attack);
    }
}



