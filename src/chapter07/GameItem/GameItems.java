package chapter07.GameItem;

public abstract class GameItems {
    String classType;
    String name;
    boolean type;

    protected GameItems() {}

    protected GameItems(String classType, String name,boolean type){
        this.classType = classType;
        this.name = name;
        this.type = type;
    }

    public String getClassType() {
        return classType;
    }

    public String getName() {
        return name;
    }

    public boolean isType() {
        if (type = true){
            System.out.println("가능");
        }else {
            System.out.println("불가능");
        }
        return type;
    }

    public void use() {

    }

    abstract protected void Use();{
        System.out.println("아이템종류:" + classType + "/이름:" + name + "/"+ type +"합니다");
    }
}
