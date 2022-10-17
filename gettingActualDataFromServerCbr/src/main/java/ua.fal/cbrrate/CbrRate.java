package ua.fal.cbrrate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Vladislav Domaniewski
 */

@SpringBootApplication
public class CbrRate {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(CbrRate.class).run(args);
    }
}
