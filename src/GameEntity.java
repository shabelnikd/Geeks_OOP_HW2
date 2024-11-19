public class GameEntity {
    private final int id;
    private int health;
    private int damage;

    private static int counter = 0;


    public GameEntity(int health, int damage) {
        this.id = ++counter;
        setHealth(health);
        setDamage(damage);
    }

    public int getId() {
        return id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, health);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = Math.max(0, damage);
    }


}
