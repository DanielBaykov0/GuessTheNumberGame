package baykov.daniel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // run Spring Boot application
        SpringApplication.run(Main.class, args);
    }
}