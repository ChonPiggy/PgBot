package pgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by lambertyang on 2017/1/13.
 */
@SpringBootApplication
public class PgBotApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(PgBotApplication.class, args);
    }
}
