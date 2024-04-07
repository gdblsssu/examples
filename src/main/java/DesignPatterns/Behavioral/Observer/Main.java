package DesignPatterns.Behavioral.Observer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        Blog blog = new Blog();

        Subs sub1 = new SubsImpl("Jude");
        Subs sub2 = new SubsImpl("John");

        blog.sub(sub1);
        blog.sub(sub2);

        blog.publish("Some post. Date: " +
                new SimpleDateFormat("HH:mm:ss dd.MM.yy").format(Calendar.getInstance().getTime()));
    }
}
