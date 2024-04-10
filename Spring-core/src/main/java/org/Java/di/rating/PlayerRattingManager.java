package org.Java.di.rating;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.Java.di.rating")
public class PlayerRattingManager {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PlayerRattingManager.class);
        PlayerService service = context.getBean("playerService", PlayerService.class);
        service.getPlayerWithRatting().forEach(System.out::println);
    }
}
