package chapter07.GameItem;

public class Potion extends GameItems {
    String name;

        public Potion() {super("포션");}

    @Override
    public void Use() {
        System.out.println(name + "은 거래가 불가능합니다");
    }
}
