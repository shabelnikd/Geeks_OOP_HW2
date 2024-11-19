public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        setWeapon(weapon);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.printf("Boss (id: %d) | Health: %d | Damage: %d | Weapon Type: %s | Weapon: %s\n",
                getId(),
                getHealth(),
                getDamage(),
                getWeapon().getWeaponType(),
                getWeapon().getWeaponName()

        );
    }

}
