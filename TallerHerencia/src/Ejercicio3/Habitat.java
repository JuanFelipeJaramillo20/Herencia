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
public class Habitat extends Producto {
    
    public static final char GRANDE = 'L';
    public static final char MEDIO = 'M';
    public static final char PEQUENO = 'S';
    private String tipoHabitat;
    private char tamano;
    
    public Habitat(double costo,String id, String tipoHabitat, char tamano) {
        super(costo, id);
        this.tipoHabitat = tipoHabitat;
        this.tamano = tamano;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public char getTamano() {
        return tamano;
    }

    public void setTamano(char tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Habitat{" +"ID: "+ getId() + ", tipoHabitat=" + tipoHabitat + ", tamano=" + tamano + ", precio = " + getCosto() + '}';
    }
    
    
}
