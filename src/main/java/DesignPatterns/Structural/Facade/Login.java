package DesignPatterns.Structural.Facade;

public class Login {
    SomeSystem someSystem;

    public Login(SomeSystem someSystem, DBSystem dbSystem) {
        this.someSystem = someSystem;
        someSystem.connectionDB(dbSystem);
    }

    public void login(String name, String pass){
        User user = someSystem.login(name, pass);
        if(user != null)
            System.out.println("Login");
    }


}
