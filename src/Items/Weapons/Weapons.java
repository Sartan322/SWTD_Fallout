package Items.Weapons;

public abstract class Weapons {
    int[] weaponDamages;
    String[] weaponNames;

    public Weapons() {
        this.weaponDamages = new int[20];
        this.weaponNames = new String[20];
    }
    public abstract int attack();
}
