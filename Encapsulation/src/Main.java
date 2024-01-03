public class Main {
    public static void main(String[] args) {
        /*
        Player player = new Player();
        player.name = "Kimsang";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
         */

        EnhancedPlayer kimsang = new EnhancedPlayer("Kimsang", 200, "Gun");
        System.out.println("Initial health is " + kimsang.healthRemaining());
    }
}