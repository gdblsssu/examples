package DesignPatterns.Structural.Facade;

import java.util.HashMap;
import java.util.Map;

public class DBSystem {
    Map<String, String> users = new HashMap<>();

    boolean checkLogin(String login){
        return users.containsKey(login);
    }

    boolean checkPassword(String login, String pass){
        return users.get(login).equals(pass);
    }

}
