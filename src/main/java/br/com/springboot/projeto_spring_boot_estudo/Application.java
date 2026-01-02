package br.com.springboot.projeto_spring_boot_estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * Spring Boot application starter class
 */
//@EntityScan(basePackages = "br.com.springboot.projeto_spring_boot_estudo.model")
@SpringBootApplication // Efetua toda a leitura a partir dessa notação
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); /*É a linha de código principal que roda o projeto Java Spring*/
    }
}
