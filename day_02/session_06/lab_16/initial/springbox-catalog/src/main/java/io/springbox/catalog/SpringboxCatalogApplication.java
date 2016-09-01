package io.springbox.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringboxCatalogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboxCatalogApplication.class, args);
    }
}
