/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2.biblioteca.git;

public abstract class Material {

    private String codigo;
    private String titulo;
    private String yearpublic;

    public Material() {
    }

    public Material(String codigo, String titulo, String yearpublic) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.yearpublic = yearpublic;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getYearpublic() {
        return yearpublic;
    }

    public void setYearpublic(String yearpublic) {
        this.yearpublic = yearpublic;
    }

}
