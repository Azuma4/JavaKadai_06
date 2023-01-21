package raisetech.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class HelloWorldController {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        String message = "hello world!";
        return message;
    }

    @GetMapping("/time")
    public String showCurrentTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter jptime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return now.format(jptime);
    }
}
