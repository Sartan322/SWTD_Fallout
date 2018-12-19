package Items.Weapons;

public class ColdSteel {
    private String[] weaponNames;
    private int[][] weaponDamage;
    private final static int COLDS_STEEL_COUNT = 16;


    public ColdSteel() {
        this.weaponNames = new String[COLDS_STEEL_COUNT];
        this.weaponDamage = new int[COLDS_STEEL_COUNT][COLDS_STEEL_COUNT];
        weaponNames[0] = "Боевой нож";
        weaponDamage[0][0] = 3;
        weaponDamage[0][1] = 11;
        weaponNames[1] = "Нож";
        weaponDamage[1][0] = 1;
        weaponDamage[1][1] = 6;
        weaponNames[2] = "Шило";
        weaponDamage[2][0] = 1;
        weaponDamage[2][1] = 4;
        weaponNames[3] = "Выкидной нож";
        weaponDamage[3][0] = 2;
        weaponDamage[3][1] = 5;
        weaponNames[4] = "Метательный нож";
        weaponDamage[4][0] = 3;
        weaponDamage[4][1] = 6;
        weaponNames[5] = "Вакидзаси";
        weaponDamage[5][0] = 4;
        weaponDamage[5][1] = 12;
        weaponNames[6] = "Дубинка";
        weaponDamage[6][0] = 1;
        weaponDamage[6][1] = 6;
        weaponNames[7] = "Монтировка";
        weaponDamage[7][0] = 3;
        weaponDamage[7][1] = 11;
        weaponNames[8] = "Гаечный ключ";
        weaponDamage[8][0] = 3;
        weaponDamage[8][1] = 6;
        weaponNames[9] = "Копьеё";
        weaponDamage[9][0] = 3;
        weaponDamage[9][1] = 11;
        weaponNames[10] = "Заточенное копьё";
        weaponDamage[10][0] = 4;
        weaponDamage[10][1] = 12;
        weaponNames[11] = "Кувалда";
        weaponDamage[11][0] = 4;
        weaponDamage[11][1] = 9;
        weaponNames[12] = "Суперкувалда";
        weaponDamage[12][0] = 18;
        weaponDamage[12][1] = 36;
        weaponNames[13] = "Потрошитель";
        weaponDamage[13][0] = 15;
        weaponDamage[13][1] = 32;
        weaponNames[14] = "Электрокнут";
        weaponDamage[14][0] = 12;
        weaponDamage[14][1] = 20;
        weaponNames[15] = "Суперэлектрокнут";
        weaponDamage[15][0] = 20;
        weaponDamage[15][1] = 33;

    }
}
