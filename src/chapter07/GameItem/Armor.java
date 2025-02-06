package chapter07.GameItem;

public class Armor extends GameItems {

    String name;

    public Armor() {super("방어구");}

    @Override
    public void Use() {
        System.out.println(name + "거래가 가능합니다");
    }
}
