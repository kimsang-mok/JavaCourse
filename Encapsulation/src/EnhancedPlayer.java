public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health <= 0) {
            this.health = 1;
        } else {
            this.health = Math.min(health, 100);
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out of the game.");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    public void restoreHealth(int extraHealth) {
        this.health = this.health + extraHealth;
        if (this.health > 100) {
            System.out.println("Player restored to 100%.");
            this.health = 100;
        }
    }
}
