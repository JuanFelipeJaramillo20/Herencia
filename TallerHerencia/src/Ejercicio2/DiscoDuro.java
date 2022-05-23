/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Valentina 202060174
 */
public class DiscoDuro {
    private int capacidad;
    private String tipoDisco;
    
    public DiscoDuro(String tipoDisco, int capacidad){
        this.capacidad= capacidad;
        this.tipoDisco= tipoDisco;
    }
    
    //getters

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }
    
    
    //setters

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }
    
}
