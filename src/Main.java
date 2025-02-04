public class Main {
    public static void main(String[] args) {
        Character player = new Character();

        player.swingSword();
        player.swingSword();
        player.swingSword();
        player.swingSword();
        player.swingSword();
        player.swingSword();

        player.takeDamage(30);
        player.takeDamage(50);
        player.takeDamage(20);

        player.rest();

        System.out.println("Character's health: " + player.getHealth() + ", stamina: " + player.getStamina() + ".");
    }
}