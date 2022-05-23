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
public class Mascota extends Producto {
    
    public String clase;
    public int edadEnMeses;
    
    public Mascota(double costo,String id, String clase, int edadEnMeses) {
        super(costo, id);
        this.clase = clase;
        this.edadEnMeses = edadEnMeses;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getEdadEnMeses() {
        return edadEnMeses;
    }

    public void setEdadEnMeses(int edadEnMeses) {
        this.edadEnMeses = edadEnMeses;
    }

    @Override
    public String toString() {
        return "Mascota{" +"ID: "+ getId() + ", clase=" + clase + ", edadEnMeses=" + edadEnMeses + ", precio = " + getCosto() +'}';
    }
    
    
}
