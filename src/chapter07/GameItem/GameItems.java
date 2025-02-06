package chapter07.GameItem;

public abstract class GameItems {
    String name;

    protected GameItems() {}

    protected GameItems(String name){
        this.name = name;
    }


    public void use() {

    }

    abstract protected void Use();
}
