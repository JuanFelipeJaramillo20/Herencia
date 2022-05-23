/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.Producto;

/**
 *
 * @author juanf 202060257
 */
public class Alimento extends Producto{
    
    private String nombre;
    private double pesoEnGramos;
    
    public Alimento(double costo,String id, String nombre, double pesoEnGramos) {
        super(costo, id);
        this.nombre = nombre;
        this.pesoEnGramos = pesoEnGramos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoEnGramos() {
        return pesoEnGramos;
    }

    public void setPesoEnGramos(double pesoEnGramos) {
        this.pesoEnGramos = pesoEnGramos;
    }

    @Override
    public String toString() {
        return "Alimento{" +"ID: "+ getId() + ", nombre=" + nombre + ", pesoEnGramos=" + pesoEnGramos + ", precio = " + getCosto() + '}';
    }

    
    
}
