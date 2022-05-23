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
public class Botas extends Zapato{
    private boolean tieneCarramplones;
    private String tipoDeCania;
    private EstiloBotas estiloBota;
    public Botas(Material material, double talla, Marcas marca, boolean sonDeTemporada,
            int precio, String color, boolean tieneCarramplones, String tipoDeCania, EstiloBotas estiloBota) {
        super(material, talla, marca, sonDeTemporada, precio, color);
        this.tieneCarramplones= tieneCarramplones;
        this.tipoDeCania= tipoDeCania;
        this.estiloBota= estiloBota;
    }
    
    //métodos generales
    @Override
    public void mostrarInformacion(){
        System.out.println("-------- Información zapato --------");
        System.out.println("");
        System.out.println("// Botas //" + "\n");
        super.mostrarInformacion();
        System.out.println(obtenerEnLetraTieneCarramplones());
        System.out.println("Tipo de caña: " + tipoDeCania);
        System.out.println("estilo de bota: " + estiloBota.toString());
    }
    public String obtenerEnLetraTieneCarramplones(){
        if(tieneCarramplones){
            return "los zapatos tienen carramplones";
        }else{
            return "Los zapatos no tienen carramplones";
        }
    }
    
    //getters

    public boolean isTieneCarramplones() {
        return tieneCarramplones;
    }

    public String getTipoDeCania() {
        return tipoDeCania;
    }

    public String getEstiloBota() {
        return estiloBota.toString();
    }
    
    
    //setters

    public void setTieneCarramplones(boolean tieneCarramplones) {
        this.tieneCarramplones = tieneCarramplones;
    }

    public void setTipoDeCania(String tipoDeCania) {
        this.tipoDeCania = tipoDeCania;
    }

    public void setEstiloBota(String estiloBota) {
        this.estiloBota = EstiloBotas.valueOf(estiloBota);
    }
    
    
}
