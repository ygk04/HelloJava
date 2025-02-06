package chapter07.GameItem;

public class GameItemExample {
    public static void main(String[] args) {

        GameItems playerWeapon = new Weapon();
        GameItems playerPotion = new Potion();

        playerWeapon.use();
        playerPotion.use();


    }
}
