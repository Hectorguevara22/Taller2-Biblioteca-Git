/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller2.biblioteca.git;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class main {

    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static Prestamo crearPrestamo() {
        System.out.println("         CREAR PRESTAMO ");

        System.out.print("Ingrese ID del préstamo: ");
        String idPrestamo = sc.nextLine();
        System.out.print("Ingrese identificación del cliente: ");
        String idCliente = sc.nextLine();
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado.");
            return null;
        }
        System.out.print("Ingrese código del libro: ");
        String codigoLibro = sc.nextLine();
        Libro libroEncontrado = null;

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libroEncontrado = libro;
                break;
            }
        }
        if (libroEncontrado == null) {
            System.out.println("Libro no encontrado.");
            return null;
        }
        if (!libroEncontrado.isDisponible()) {
            System.out.println("El libro no está disponible.");
            return null;
        }
        Prestamo p = new Prestamo(
                idPrestamo,
                clienteEncontrado,
                libroEncontrado,
                LocalDate.now(),
                "Activo"
        );
        libroEncontrado.setDisponible(false);
        prestamos.add(p);
        System.out.println("\nPréstamo creado correctamente.");
        System.out.println("ID préstamo: " + p.getIdPrestamo());
        System.out.println("Cliente: " + p.getCliente().getNombre());
        System.out.println("Libro: " + p.getLibro().getTitulo());
        System.out.println("Fecha: " + p.getFecha());
        System.out.println("Estado: " + p.getEstado());
        sc.nextLine();
        return p;
    }
    public static void devolverPrestamo() {

        System.out.println("\n===== DEVOLVER PRESTAMO =====");

        System.out.print("Ingrese el ID del préstamo: ");
        String idPrestamo = sc.nextLine();

        for (Prestamo prestamo : prestamos) {

            if (prestamo.getIdPrestamo().equals(idPrestamo)) {

                System.out.println("\nPréstamo encontrado:");
                System.out.println("ID: " + prestamo.getIdPrestamo());
                System.out.println("Cliente: " + prestamo.getCliente().getNombre());
                System.out.println("Libro: " + prestamo.getLibro().getTitulo());
                System.out.println("Fecha: " + prestamo.getFecha());
                System.out.println("Estado: " + prestamo.getEstado());

                if (prestamo.getEstado().equals("Devuelto")) {
                    System.out.println("Este préstamo ya fue devuelto.");
                    return;
                }
                prestamo.setEstado("Devuelto");

                prestamo.getLibro().setDisponible(true);

                System.out.println("\nPréstamo devuelto correctamente.");
                System.out.println("El libro ahora está disponible.");
                sc.nextLine();
                return;
            }
        }

        System.out.println("No se encontró un préstamo con ese ID.");
    }
       public static void listarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }

        System.out.println("\n       LISTA DE PRÉSTAMOS ");

        for (Prestamo p : prestamos) {
            System.out.println("ID Préstamo: " + p.getIdPrestamo());
            System.out.println("Cliente: " + p.getCliente().getNombre());
            System.out.println("Libro: " + p.getLibro().getTitulo());
            System.out.println("Fecha: " + p.getFecha());
            System.out.println("Estado: " + p.getEstado());
            System.out.println("-----------------------------");
        }
         sc.nextLine();
    }
}
