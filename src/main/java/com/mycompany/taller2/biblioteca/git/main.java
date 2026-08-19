/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller2.biblioteca.git;

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
}
