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
public class Ram {
    private int capacidadTotal;
    private int velocidad;
    private String tecnologia;
    
    public Ram(int capacidadTotal, int velocidad, String tecnologia){
        this.capacidadTotal= capacidadTotal;
        this.velocidad= velocidad;
        this.tecnologia= tecnologia;
    }
    
    //getters

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getTecnologia() {
        return tecnologia;
    }
    
    //setters

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    
}
