/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller2.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

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

}
