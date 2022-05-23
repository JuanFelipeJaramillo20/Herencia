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
public class Zapatillas extends Zapato{
    
    private boolean tieneProtectorTendonAquiles;
    private boolean tieneCamaraDeAire;
    private boolean sonFlexibles;
    private String deporte; //Este atributo se encarga de especificar para que deporte
    //sirven los tennis deportivos

    public Zapatillas(Material material, double talla, Marcas marca,boolean sonDeTemporada,
            int precio, String color, boolean tieneProtectorTendonAquiles, boolean tieneCamaraDeAire, boolean sonFlexibles, String deporte) {
        super(material, talla, marca, sonDeTemporada, precio, color);
        this.tieneProtectorTendonAquiles= tieneProtectorTendonAquiles;
        this.tieneCamaraDeAire= tieneCamaraDeAire;
        this.sonFlexibles= sonFlexibles;
        this.deporte= deporte;
        
    }
    
    //Métodos generales
    
    @Override
    public void mostrarInformacion(){
        System.out.println("-------- Información zapato --------");
        System.out.println("");
        System.out.println("// ZAPATILLAS //" + "\n");
        super.mostrarInformacion(); 
        System.out.println(obtenerEnLetraTieneProtectorTendonAquiles());
        System.out.println(obtenerEnLetraTieneCamaraDeAire());
        System.out.println(obtenerEnLetraSonFlexibles());
        System.out.println("Estas zapatillas son esencialmente para: " + deporte);
    }

    public String obtenerEnLetraTieneProtectorTendonAquiles() {
        if(tieneProtectorTendonAquiles){
            return "Cuenta con tobilleras para tendon de aquiles";
        }else{
            return "No cuenta con tobilleras para tendon de aquiles";
        }
    }
    
    public String obtenerEnLetraTieneCamaraDeAire(){
        if(tieneCamaraDeAire){
            return "Trae integrado camara de aire";
        }else{
            return "No trae integrado camara de aire";
        }
    }
    
    public String obtenerEnLetraSonFlexibles(){
        if(sonFlexibles){
            return "Son flexibles";
        }else{
            return "No son flexibles";
        }
    }
    
    //getters

    public boolean isTieneProtectorTendonAquiles() {
        return tieneProtectorTendonAquiles;
    }

    public boolean isTieneCamaraDeAire() {
        return tieneCamaraDeAire;
    }

    public boolean isSonFlexibles() {
        return sonFlexibles;
    }

    public String getDeporte() {
        return deporte;
    }
    
    
    //setters

    public void setTieneProtectorTendonAquiles(boolean tieneProtectorTendonAquiles) {
        this.tieneProtectorTendonAquiles = tieneProtectorTendonAquiles;
    }

    public void setTieneCamaraDeAire(boolean tieneCamaraDeAire) {
        this.tieneCamaraDeAire = tieneCamaraDeAire;
    }

    public void setSonFlexibles(boolean sonFlexibles) {
        this.sonFlexibles = sonFlexibles;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    
    
    
    
}
