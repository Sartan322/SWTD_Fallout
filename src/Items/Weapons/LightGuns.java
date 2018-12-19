package Items.Weapons;

public class LightGuns {
    private String[] weaponPistolsNames;
    private int[][] weaponPistolsDamage;
    private final static int PISTOLS_COUNT = 7;
    private String[] weaponAutoPistolsNames;
    private int[][] weaponAutoPistolsDamage;
    private final static int AUTOPISTOLS_COUNT = 7;

    public LightGuns() {
        pistols();
        submuchineGun();
    }
    private void pistols(){
        this.weaponPistolsNames = new String[PISTOLS_COUNT];
        this.weaponPistolsDamage = new int[PISTOLS_COUNT][PISTOLS_COUNT];
        weaponPistolsNames[0] = "Пистолет 0.233";
        weaponPistolsDamage[0][0] = 20;
        weaponPistolsDamage[0][1] = 30;
        weaponPistolsNames[1] = "Револьвер Магнум 0,44";
        weaponPistolsDamage[1][0] = 12;
        weaponPistolsDamage[1][1] = 18;
        weaponPistolsNames[2] = "9мм Маузер";
        weaponPistolsDamage[2][0] = 5;
        weaponPistolsDamage[2][1] = 10;
        weaponPistolsNames[3] = "10мм пистолет";
        weaponPistolsDamage[3][0] = 5;
        weaponPistolsDamage[3][1] = 12;
        weaponPistolsNames[4] = "Дизерт Игл 0,44";
        weaponPistolsDamage[4][0] = 10;
        weaponPistolsDamage[4][1] = 16;
        weaponPistolsNames[5] = "Пистолет Гаусса";
        weaponPistolsDamage[5][0] = 22;
        weaponPistolsDamage[5][1] = 32;
        weaponPistolsNames[6] = "10мм пистолет-пулемёт";
        weaponPistolsDamage[6][0] = 5;
        weaponPistolsDamage[6][1] = 12;
    }
    public void submuchineGun(){
        this.weaponAutoPistolsNames = new String[AUTOPISTOLS_COUNT];
        this.weaponAutoPistolsDamage = new int[AUTOPISTOLS_COUNT][AUTOPISTOLS_COUNT];
        weaponAutoPistolsNames[0] = "10мм пистолет-пулемёт";
        weaponAutoPistolsDamage[0][0] = 5;
        weaponAutoPistolsDamage[0][1] = 12;
        weaponAutoPistolsNames[1] = "ПП М3 Гриз Ган";
        weaponAutoPistolsDamage[1][0] = 10;
        weaponAutoPistolsDamage[1][1] = 20;
        weaponAutoPistolsNames[2] = "Томмиган";
        weaponAutoPistolsDamage[2][0] = 3;
        weaponAutoPistolsDamage[2][1] = 20;
        weaponAutoPistolsNames[3] = "H&K G11";
        weaponAutoPistolsDamage[3][0] = 10;
        weaponAutoPistolsDamage[3][1] = 20;
        weaponAutoPistolsNames[4] = "H&K G11E";
        weaponAutoPistolsDamage[4][0] = 13;
        weaponAutoPistolsDamage[4][1] = 23;
        weaponAutoPistolsNames[5] = "H&K P90c";
        weaponAutoPistolsDamage[5][0] = 12;
        weaponAutoPistolsDamage[5][1] = 16;
        weaponAutoPistolsNames[6] = "10мм пистолет-пулемёт";
        weaponAutoPistolsDamage[6][0] = 5;
        weaponAutoPistolsDamage[6][1] = 12;
    }
   /* public void automatic(){
        this.weaponAutoPistolsNames = new String[AUTOPISTOLS_COUNT];
        this.weaponAutoPistolsDamage = new int[AUTOPISTOLS_COUNT][AUTOPISTOLS_COUNT];
        weaponAutoPistolsNames[0] = "10мм пистолет-пулемёт";
        weaponAutoPistolsDamage[0][0] = 5;
        weaponAutoPistolsDamage[0][1] = 12;
        weaponAutoPistolsNames[1] = "ПП М3 Гриз Ган";
        weaponAutoPistolsDamage[1][0] = 10;
        weaponAutoPistolsDamage[1][1] = 20;
        weaponAutoPistolsNames[2] = "Томмиган";
        weaponAutoPistolsDamage[2][0] = 3;
        weaponAutoPistolsDamage[2][1] = 20;
        weaponAutoPistolsNames[3] = "H&K G11";
        weaponAutoPistolsDamage[3][0] = 10;
        weaponAutoPistolsDamage[3][1] = 20;
        weaponAutoPistolsNames[4] = "H&K G11E";
        weaponAutoPistolsDamage[4][0] = 13;
        weaponAutoPistolsDamage[4][1] = 23;
        weaponAutoPistolsNames[5] = "H&K P90c";
        weaponAutoPistolsDamage[5][0] = 12;
        weaponAutoPistolsDamage[5][1] = 16;
        weaponAutoPistolsNames[6] = "10мм пистолет-пулемёт";
        weaponAutoPistolsDamage[6][0] = 5;
        weaponAutoPistolsDamage[6][1] = 12;
        weaponAutoPistolsNames[7] = "";
        weaponAutoPistolsDamage[7][0] = ;
        weaponAutoPistolsDamage[7][1] = ;
        weaponAutoPistolsNames[8] = "";
        weaponAutoPistolsDamage[8][0] = ;
        weaponAutoPistolsDamage[8][1] = ;
        weaponAutoPistolsNames[9] = "";
        weaponAutoPistolsDamage[9][0] = ;
        weaponAutoPistolsDamage[9][1] = ;
        weaponAutoPistolsNames[10] = "";
        weaponAutoPistolsDamage[10][0] = ;
        weaponAutoPistolsDamage[10][1] = ;
        weaponAutoPistolsNames[11] = "";
        weaponAutoPistolsDamage[11][0] = ;
        weaponAutoPistolsDamage[11][1] = ;
        weaponAutoPistolsNames[12] = "";
        weaponAutoPistolsDamage[12][0] = ;
        weaponAutoPistolsDamage[12][1] = ;
        weaponAutoPistolsNames[13] = "";
        weaponAutoPistolsDamage[13][0] = ;
        weaponAutoPistolsDamage[13][1] = ;
        weaponAutoPistolsNames[14] = "";
        weaponAutoPistolsDamage[14][0] = ;
        weaponAutoPistolsDamage[14][1] = ;

    }*/
}
