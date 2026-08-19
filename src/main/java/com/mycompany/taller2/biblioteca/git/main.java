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

    public static void listarlibros() {
        System.out.println("consulta de libro");
        for (Libro libro : libros) {
            System.out.println("codigo " + libro.getCodigo());
            System.out.println("titulo " + libro.getTitulo());
            System.out.println("año de publicacion " + libro.getYearpublic());
            System.out.println("autor " + libro.getAutor());
            System.out.println("estado" + libro.isDisponible());
            System.out.println("----------------------");
        }
        sc.nextLine();
    }

    public static Libro buscarlibros() {
        System.out.println("consulta selectiva de libro");
        System.out.println("codigo del libro");
        String codigo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("codigo" + libro.getCodigo());
                System.out.println("titulo" + libro.getTitulo());
                System.out.println("año de publicacion" + libro.getYearpublic());
                System.out.println("autor" + libro.getAutor());
                System.out.println("estado" + libro.isDisponible());
                sc.nextLine();
                return libro;
            }
        }

        System.out.println("libro no encontrado");
        sc.nextLine();
        return null;
    }

    public static Libro actualizarlibros() {
        System.out.println("actualizacion de libro");
        System.out.println("codigo del libro");
        String codigo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("codigo " + libro.getCodigo());
                System.out.println("titulo " + libro.getTitulo());
                System.out.println("año de publicacion " + libro.getYearpublic());
                System.out.println("autor " + libro.getAutor());
                System.out.println("estado " + libro.isDisponible());
                System.out.println("----------------------");
                System.out.println("nuevo titulo ");
                String titulo = sc.nextLine();
                System.out.println("nuevo año de publicacion ");
                String yearpublic = sc.nextLine();
                System.out.println("nuevo autor ");
                String autor = sc.nextLine();
                libro.setTitulo(titulo);
                libro.setYearpublic(yearpublic);
                libro.setAutor(autor);
                return libro;
            }
        }
        System.out.println("libro no encontrado ");
        return null;
    }
}
