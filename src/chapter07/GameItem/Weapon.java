package chapter07.GameItem;

public class Weapon extends GameItems {

    String name;

    public Weapon() {super("무기");}


    @Override
    public void Use() {
        System.out.println(name +"거래가 가능합니다");
    }

}
