package com.alura.literalura;

import com.alura.literalura.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(LiteraluraApplication.class, args);

        Principal principal = new Principal();
        principal.muestraMenu();
    }
}