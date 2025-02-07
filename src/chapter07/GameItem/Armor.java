package chapter07.GameItem;

public class Armor extends GameItems {

    String name;


    public Armor() {
        super("방어구", "방패",true );
    }
    @Override
    public void Use() {
        System.out.println(classType+name + type);
    }

}


