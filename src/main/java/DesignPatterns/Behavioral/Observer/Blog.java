package DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<Subs> subs;
    List<String> posts;

    public Blog() {
        subs = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void publish(String post){
        posts.add(post);
        notifySubs(post);
    }

    public void sub(Subs sub){
        subs.add(sub);
    }

    public void unsub(Subs sub){
        subs.remove(sub);
    }

    private void notifySubs(String post){
        for(Subs sub: subs){
            sub.update(post);
        }
    }
}
