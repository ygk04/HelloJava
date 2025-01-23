package practice.homework.entity;

public class User {

    private Wallet wallet;

    public User(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    String name;

    
    public User(String name ) {
        this.name = name;

    }


}
