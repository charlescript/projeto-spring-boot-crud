package br.com.springboot.projeto_spring_boot_estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication // Efetua toda a leitura a partir dessa notação
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); /*É a linha de código principal que roda o projeto Java Spring*/
    }
}
