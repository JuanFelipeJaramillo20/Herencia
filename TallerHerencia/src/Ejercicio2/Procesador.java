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
public class Procesador {
    private String marcaProcesador;
    private String modeloProcesador;
    private String procesador;
    private double velocidad;
    private int numNucleos;
    
    public Procesador(){
        marcaProcesador= "No se ha asignado una marca";
        modeloProcesador= "No se ha asignado un modelo";
        procesador="ninguno";
        velocidad= 0.0;
        numNucleos= 0;
    }
    
    public Procesador(String marcaProcesador, String modeloProcesador, String procesador, double velocidad,
            int numNucleos){
        this.marcaProcesador= marcaProcesador;
        this.modeloProcesador= modeloProcesador;
        this.procesador= procesador;
        this.velocidad= velocidad;
        this.numNucleos= numNucleos;
        
    }
    
    //getters

    public String getMarcaProcesador() {
        return marcaProcesador;
    }

    public String getModeloProcesador() {
        return modeloProcesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getNumNucleos() {
        return numNucleos;
    }
    
    
    //setters

    public void setMarcaProcesador(String marcaProcesador) {
        this.marcaProcesador = marcaProcesador;
    }

    public void setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }
    
}
