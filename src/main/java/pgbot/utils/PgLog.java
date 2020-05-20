package pgbot.utils;

import com.linecorp.bot.model.event.Event;

public class PgLog {

    public static void info(String log) {
        System.out.println(log);        
    }
    
    public static void info(String log, Event event) {
        System.out.println(log + " Event: " + event);        
    }
    
    public static void error(String log) {
        System.out.println(log);        
    }
}
