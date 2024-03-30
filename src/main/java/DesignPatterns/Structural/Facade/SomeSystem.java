package DesignPatterns.Structural.Facade;

public class SomeSystem {
    DBSystem dbSystem;

    public SomeSystem() {
    }

    public void connectionDB(DBSystem db){
        this.dbSystem = db;
    }

    public User login(String name, String pass){
        if(dbSystem.checkLogin(name)){
            if(dbSystem.checkPassword(name, pass))
                return new User(name, pass);
        }
        System.out.println("Login error");
        return null;
    }


}
