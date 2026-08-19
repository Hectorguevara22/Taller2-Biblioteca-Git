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
}
