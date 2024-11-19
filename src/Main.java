//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000, 70, new Weapon(WeaponType.COLD_WEAPONS, "BIG Sword"));
        boss.printInfo();


        Weapon bow = new Weapon(WeaponType.COLD_WEAPONS, "Dark Bow");
        Skeleton skFirst = new Skeleton(700, 90, bow, 0);
        skFirst.setArrowsCount(45);
        skFirst.printInfo();

        Skeleton skSecond = new Skeleton(700, 120, bow, 40);
        skSecond.printInfo();

    }
}