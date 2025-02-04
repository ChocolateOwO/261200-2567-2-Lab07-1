public class Character {
    private int health;
    private int stamina;
    private final int maxHealth = 100;
    private final int maxStamina = 220;

    public Character() {
        this.health = maxHealth;
        this.stamina = maxStamina;
        System.out.println("your character have" + health + " health and " + stamina + " stamina.");
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public void swingSword() {
        if (stamina >= 10) {
            stamina -= 44;
            System.out.println("Character swings sword. Stamina now " + stamina + "!!");
        } else {
            stamina = 0;
            System.out.println("Your character needs to cool down.");
        }
    }

    public void takeDamage(int damageAmount) {
        health -= damageAmount;
        if (health <= 0) {
            health = 0;
            System.out.println("Character is dead.");
        } else {
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");
        }
    }

    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
