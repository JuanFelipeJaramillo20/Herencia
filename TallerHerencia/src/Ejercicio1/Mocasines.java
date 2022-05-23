/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Andom 2059956-3743
 */
public class Mocasines extends Zapato{
    private TipoMocasines tipo;
    private String formaDeLaPunta;
    private boolean esFormal;

    public Mocasines(Material material, double talla, Marcas marca,boolean sonDeTemporada,
            int precio, String color, TipoMocasines tipo, String formaDeLaPunta, boolean esFormal) {
        super(material, talla, marca, sonDeTemporada, precio, color);
        this.tipo= tipo;
        this.formaDeLaPunta= formaDeLaPunta;
        this.esFormal= esFormal;
    }
    //métodos generales

    @Override
    public void mostrarInformacion() {
        System.out.println("-------- Información zapato --------");
        System.out.println("");
        System.out.println("// MOCASINES //" + "\n");
        super.mostrarInformacion();
        System.out.println("Modelo de los mocasines: " + tipo.toString());
        System.out.println("Forma de la punta de los mocasines: " + formaDeLaPunta);
        System.out.println(esFormal? "son para ocasión formal": "Son informales.");
    }
    
    //getters

    public String getTipo() {
        return tipo.toString();
    }

    public String getFormaDeLaPunta() {
        return formaDeLaPunta;
    }

    public boolean isFormal() {
        return esFormal;
    }
    
    //setters

    public void setTipo(String tipo) {
        this.tipo =  TipoMocasines.valueOf(tipo);
    }

    public void setFormaDeLaPunta(String formaDeLaPunta) {
        this.formaDeLaPunta = formaDeLaPunta;
    }

    public void setEsFormal(boolean esFormal) {
        this.esFormal = esFormal;
    }

    
    
    
}
