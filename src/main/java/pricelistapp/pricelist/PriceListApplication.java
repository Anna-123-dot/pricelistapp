package pricelistapp.pricelist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"pricelistapp.pricelist.service"})
public class PriceListApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriceListApplication.class, args);
    }

}
