package org.nordstrom.webserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@EnableJpaRepositories("org.nordstrom.webserver")

@SpringBootApplication
public class WebServer {
    public static void main(String[] args) { SpringApplication.run(WebServer.class, args); }

    @Bean
    CommandLineRunner initDatabase(SimpleMessageRepository messages) {
        return args -> {
            messages.save(new SimpleMessage("Init database"));
        };
    }
}
