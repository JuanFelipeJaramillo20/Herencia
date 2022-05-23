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
public class MotherBoard {
    private String marca;
    private String modelo;

    
    
    public MotherBoard(String marca, String modelo){
        this.marca= marca;
        this.modelo= modelo;

    }
    
    //getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    
    //setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
}
