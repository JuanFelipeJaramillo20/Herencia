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
public class Zapato {
    private Material material;
    private double talla;
    private Marcas marca;
    private boolean sonDeTemporada;
    private int precio;
    private String color;
    
    public Zapato(Material material, double talla, Marcas marca, boolean sonDeTemporada,
            int precio, String color){
        this.material= material;
        this.talla= talla;
        this.marca= marca;
        this.sonDeTemporada= sonDeTemporada;
        this.precio= precio;
        this.color= color;
    }
    
    //métodos generales
    public void mostrarInformacion(){
        System.out.println("Material: " + material.toString());
        System.out.println("Talla: " + talla + "cm");
        System.out.println("Marca: " + marca.toString());
        System.out.println(sonDeTemporada? "Son de temporada": "No son de temporada");
        System.out.println("Precio: " + precio);
        System.out.println("Color: " + color);
    }
    
    //getters

    public String getMaterial() {
        return material.toString();
    }

    public double getTalla() {
        return talla;
    }

    public String getMarca() {
        return marca.toString();
    }

    public boolean isSonDeTemporada() {
        return sonDeTemporada;
    }
    
    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }
    
    
   
    //setters

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public void setMarca(String marca) {
        this.marca = Marcas.valueOf(marca);
    }

    public void setSonDeTemporada(boolean sonDeTemporada) {
        this.sonDeTemporada = sonDeTemporada;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}
