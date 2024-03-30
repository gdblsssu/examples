package DesignPatterns.Structural.Facade;

public class User{
    String name;
    String password;

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
