package practice.homework.entity;

public class User {
    String name;
    int money;
    
    public User(String name, int money) {
        this.name = name;
        this.money = 0;
    }

    @Override
    public String toString() {
        return "User{" +
                 name + '\'' +
                ", money:'" + money + '\'' +
                '}';
    }
}
