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
public class TarjetaGrafica {
    private String fabricante;
    private String tipoDeMemoria;
    private int tamanioMemoria;
    
    public TarjetaGrafica(String fabricante, String tipoDeMemoria, int tamanioMemoria){
        this.fabricante= fabricante;
        this.tipoDeMemoria= tipoDeMemoria;
        this.tamanioMemoria= tamanioMemoria;
    }
    
    //getters

    public String getFabricante() {
        return fabricante;
    }

    public String getTipoDeMemoria() {
        return tipoDeMemoria;
    }

    public int getTamanioMemoria() {
        return tamanioMemoria;
    }
    
    
    //setters

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setTipoDeMemoria(String tipoDeMemoria) {
        this.tipoDeMemoria = tipoDeMemoria;
    }

    public void setTamanioMemoria(int tamanioMemoria) {
        this.tamanioMemoria = tamanioMemoria;
    }
    
}
