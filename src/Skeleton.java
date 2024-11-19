public class Skeleton extends Boss {
    private int arrowsCount;

    public Skeleton(int health, int damage, Weapon weapon, int arrowsCount) {
        super(health, damage, weapon);
        setArrowsCount(arrowsCount);
    }

    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = Math.max(0, arrowsCount);
    }


    @Override
    public void printInfo() {
        System.out.printf("Skeleton (id: %d) | Health: %d | Damage: %d | Weapon Type: %s | Weapon: %s | ArrowsCount: %d\n",
                getId(),
                getHealth(),
                getDamage(),
                getWeapon().getWeaponType(),
                getWeapon().getWeaponName(),
                getArrowsCount()
        );
    }
}
