package chapter07.GameItem;

public class Weapon extends GameItems {

    String name;

    public Weapon() {super("무기","검",true);}


    @Override
    public void Use() {
        System.out.println(classType+name + type);
    }

}
