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
public class Sandalias extends Zapato{
    private String materialSuelaAtadoAlPie;
    private boolean esDePlataforma;
    
    public Sandalias(Material material, double talla, Marcas marca, boolean sonDeTemporada, 
          int precio, String color, String materialSuelaAtadoAlPie, boolean esDePlataforma) {
        super(material, talla, marca, sonDeTemporada, precio, color);
        this.materialSuelaAtadoAlPie= materialSuelaAtadoAlPie;
        this.esDePlataforma= esDePlataforma;
    }
    //métodos generales

    @Override
    public void mostrarInformacion() {
        System.out.println("-------- Información zapato --------");
        System.out.println("");
        System.out.println("// SANDALIAS //" + "\n");
        super.mostrarInformacion(); 
        System.out.println("La suela atada al pie es por medio de: " + materialSuelaAtadoAlPie);
        System.out.println(esDePlataforma? "Las sandalias son de plataforma": "Las sandalias no son de plataforma");
    }
   
    //getters

    public String getMaterialSuelaAtadoAlPie() {
        return materialSuelaAtadoAlPie;
    }

    public boolean isEsDePlataforma() {
        return esDePlataforma;
    }
    
    
    //setters

    public void setMaterialSuelaAtadoAlPie(String materialSuelaAtadoAlPie) {
        this.materialSuelaAtadoAlPie = materialSuelaAtadoAlPie;
    }

    public void setEsDePlataforma(boolean esDePlataforma) {
        this.esDePlataforma = esDePlataforma;
    }
    
    
    
    
    
}
