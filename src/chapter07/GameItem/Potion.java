package chapter07.GameItem;

public class Potion extends GameItems {
    String name;


        public Potion() {super("포션", "Red", true );}

    @Override
    public void Use() {
        System.out.println(classType+name + type);
    }

}
