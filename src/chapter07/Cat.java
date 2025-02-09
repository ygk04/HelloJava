package chapter07;

public class Cat extends Animal{
    private int age; //나이

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("야옹!");
    }

    @Override
    public String toStr() {
        return age + "살" + getName();
    }
}
