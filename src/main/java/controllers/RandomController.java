package controllers;

import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    private Random random = new Random();
    @GetMapping("/random")
    public int getRandomNumber() {
        return random.nextInt();
    }
}