/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller2.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Libro> libros = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static Libro crearlibro() {
        System.out.println("creacion de libros");
        System.out.println("codigo");
        String codigo = sc.nextLine();
        System.out.println("titulo");
        String titulo = sc.nextLine();
        System.out.println("año de publicacion");
        String yearpublic = sc.nextLine();
        System.out.println("autor");
        String autor = sc.nextLine();
        boolean disponible = true;
        Libro libro = new Libro(codigo, titulo, yearpublic, autor, disponible);
        libros.add(libro);

        System.out.println("Libro creado correctamente.");

        return libro;
    }
}
