package practice.example.entity;

import java.util.Objects;

public class User {
    private String name;

    private String phoneNumber;


    public User(String name, String phoneNumber){

        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof User user)) return false;

        return Objects.equals(name, user.name) && Objects.equals(phoneNumber, user.phoneNumber);
    }


    @Override
    public String toString() {
        return "User{" +
                "이름='" + name + '\'' +
                ",폰번호='" + phoneNumber + '\'' +
                '}';
    }
}
