/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller2.biblioteca.git;


import java.util.ArrayList;
import java.util.Scanner;

public class main {


    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    menu();
    }
    
    public static void menu(){
    boolean e = true;
        while (e) {
            System.out.println("""
                                          sistema de biblioteca 
                               seleccione 
                               1 gestion de clientes
                               2 gestion de libros
                               3 gestion de prestamos
                               4 salir""");

            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    boolean x = true;
                    while (x) {
                        System.out.println("        gestion de clientes\n"
                                + "seleccione\n"
                                + "1 crear cliente\n"
                                + "2 listar clientes\n"
                                + "3 buscar clientes\n"
                                + "4 actualizar clientes\n"
                                + "5 borrar clientes\n"
                                + "6 salir");
                        int b = sc.nextInt();
                        sc.nextLine();
                        switch (b) {
                            case 1:
                                crearcliente();
                                break;
                            case 2:
                                readcliente();
                                break;
                            case 3:
                                buscarcliente();
                                break;
                            case 4:
                                actualizarcliente();
                                break;
                            case 5:
                                eliminarcliente();
                                break;
                            case 6:
                                x = false;
                                break;

                        }
                    }

                    break;
                case 2:
                    boolean op = true;
                    while (op) {
                        System.out.println("""
                                                   gestion de libros
                                           seleccione
                                           1 crear libro
                                           2 listar libros
                                           3 buscar libros
                                           4 actualizar libros
                                           5 borrar libros
1                                           6 salir""");
                        int k = sc.nextInt();
                        sc.nextLine();
                        switch (k) {
                            case 1:
                                crearlibro();
                                break;
                            case 2:

                                listarlibros();
                                break;
                            case 3:
                                buscarlibros();
                                break;
                            case 4:
                                actualizarlibros();
                                break;
                            case 5:
                                eliminarlibros();
                                break;
                            case 6:
                                op = false;
                                break;

                        }

                    }
                    break;
                case 3:
                    boolean z = true;
                    while (z) {
                        System.out.println("""
                                                   gestion de prestamos
                                           seleccione
                                           1 crear prestamo
                                           2 devolver prestamo
                                           3 listar prestamos
                                           4 salir""");
                        int f = sc.nextInt();
                        sc.nextLine();
                        switch (f) {
                            case 1 -> crearPrestamo();
                            case 2 -> devolverPrestamo();
                            case 3 -> listarPrestamos();
                            case 4 -> z = false;

                        }
                    }
                    break;
                case 4:
                    e = false;
            }

        }
}
=======

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
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void main() {

    }

    public static Cliente crearcliente() {
        System.out.println("id :");
        String id = sc.nextLine();
        System.out.println("nombre :");
        String nombre = sc.nextLine();
        System.out.println("telefono :");
        String telefono = sc.nextLine();
        System.out.println("correo :");
        String correo = sc.nextLine();
        Cliente cliente = new Cliente(id, nombre, telefono, correo);
        clientes.add(cliente);
        System.out.println("Cliente creado correctamente.");
        return cliente;
    }

    public static void readcliente() {
        System.out.println("consulta y listado de clientes");
        for (Cliente cliente : clientes) {
            System.out.println("id :" + cliente.getId());
            System.out.println("nombre :" + cliente.getNombre());
            System.out.println("telefono :" + cliente.getTelefono());
            System.out.println("email : " + cliente.getEmail());
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
    public static Cliente buscarcliente() {
        System.out.println("consulta selectiva de clientes");
        System.out.println("identificacion del cliente que desea buscar");
        String ide = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(ide)) {
                System.out.println("id :" + cliente.getId());
                System.out.println("nombre :" + cliente.getNombre());
                System.out.println("telefono :" + cliente.getTelefono());
                System.out.println("email : " + cliente.getEmail());
                System.out.println("----------------------");
                sc.nextLine();
                return cliente;
            }
        }
        System.out.println("cliente no encontrado");

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

    public static Libro eliminarlibros() {
        System.out.println("actualizacion de libro");
        System.out.println("codigo del libro");
        String codigo = sc.nextLine();
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                System.out.println("codigo" + libro.getCodigo());
                System.out.println("titulo" + libro.getTitulo());
                System.out.println("año de publicacion" + libro.getYearpublic());
                System.out.println("autor" + libro.getAutor());
                System.out.println("estado" + libro.isDisponible());
                libros.remove(libro);
                System.out.println("libro eliminado correctamente");
                return libro;
            }
        }
        System.out.println("libro no encontrado");
        return null;
    }

    public static Cliente actualizarcliente() {
        System.out.println("actualizacion de clientes");
        System.out.println("identificacion del cliente que desea actualizar");
        String ide = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(ide)) {
                System.out.println("id :" + cliente.getId());
                System.out.println("nombre :" + cliente.getNombre());
                System.out.println("telefono :" + cliente.getTelefono());
                System.out.println("email : " + cliente.getEmail());
                System.out.println("----------------------");
                System.out.println("nuevo nombre :");
                String nombre = sc.nextLine();
                System.out.println("nuevo telefono :");
                String telefono = sc.nextLine();
                System.out.println("nuevo correo :");
                String correo = sc.nextLine();
                cliente.setNombre(nombre);
                cliente.setTelefono(telefono);
                cliente.setEmail(correo);

                return cliente;
            }
        }
        System.out.println("Cliente no encontrado");
        return null;

    }

    public static Cliente eliminarcliente() {
        System.out.println("eliminacion de clientes");
        System.out.println("identificacion del cliente que desea eliminar");
        String ide = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(ide)) {
                System.out.println("id :" + cliente.getId());
                System.out.println("nombre :" + cliente.getNombre());
                System.out.println("telefono :" + cliente.getTelefono());
                System.out.println("email : " + cliente.getEmail());
                System.out.println("----------------------");

                clientes.remove(cliente);
                System.out.println("Cliente eliminado correctamente");

                return cliente;
            }
        }
        System.out.println("Cliente no encontrado");
        return null;
    }
}
