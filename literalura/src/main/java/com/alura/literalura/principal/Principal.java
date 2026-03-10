package com.alura.literalura.principal;

import java.util.Scanner;

public class Principal {

    Scanner teclado = new Scanner(System.in);

    public void muestraMenu(){

        int opcion = -1;

        while(opcion != 0){

            System.out.println("""
                    1 - Buscar libro por titulo
                    2 - Listar libros registrados
                    3 - Listar autores
                    4 - Listar autores vivos en un año
                    5 - Listar libros por idioma
                    0 - Salir
                    """);

            opcion = teclado.nextInt();
        }
    }
}