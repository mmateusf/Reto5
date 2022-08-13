/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5java.modelo.VO;

/**
 *
 * @author mmate
 */
public class Lider {
    private int id_Lider;
    private String nombre;
    private String primer_apellido;
    private String ciudad_residencia;
    
    public Lider(){
        
    }

    public Lider(int id_Lider, String nombre, String primer_apellido, String ciudad_residencia) {
        this.id_Lider = id_Lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.ciudad_residencia = ciudad_residencia;
    }

    public int getIdLider() {
        return id_Lider;
    }

    public void setIdLider(int id_Lider) {
        this.id_Lider = id_Lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primer_apellido;
    }

    public void setPrimerApellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getCiudadResidencia() {
        return ciudad_residencia;
    }

    public void setCiudadResidencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "id_Lider=" + id_Lider + ", nombre=" + nombre + ", primer_apellido=" + primer_apellido + ", ciudad_residencia=" + ciudad_residencia + '}';
    }
    
    
}
