/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Ejercicio3.Producto;
import Ejercicio3.Mascota;
import Ejercicio3.Habitat;
import Ejercicio3.Factura;
import Ejercicio3.Alimento;
import java.util.ArrayList;

/**
 *
 * @author juanf 202060257
 */
public class TiendaMascotas {
    
    private Factura facturaCliente;
    private ArrayList<Habitat> habitats;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Alimento> alimentos;

    public TiendaMascotas() {
        facturaCliente = new Factura();
        habitats = new ArrayList<>();
        mascotas = new ArrayList<>();
        alimentos = new ArrayList<>();
        inicializarEjemplos();
    }

    public void inicializarEjemplos(){
        Alimento a1 = new Alimento(6000, "001", "Ringo Croquetas", 500.0);
        Alimento a2 = new Alimento(8000, "002", "Oh My Cat", 500);
        Alimento a3 = new Alimento(10000, "003", "Cat Show", 500);
        alimentos.add(a1);
        alimentos.add(a2);
        alimentos.add(a3);
        
        Habitat h1 = new Habitat(70000, "001", "Tierra", 'L');
        Habitat h2 = new Habitat(50000, "002", "Sustrato", 'M');
        Habitat h3 = new Habitat(35000, "003", "Herbario", 'S');
        habitats.add(h1);
        habitats.add(h2);
        habitats.add(h3);
        
        Mascota m1 = new Mascota(200000, "001", "Perro Beagle", 2);
        Mascota m2 = new Mascota(100000, "002", "Gato Maine Coon", 5);
        Mascota m3 = new Mascota(50000, "003", "Perico", 1);
        mascotas.add(m1);
        mascotas.add(m2);
        mascotas.add(m3);
        
    }
    
    public Factura getFacturaCliente() {
        return facturaCliente;
    }

    public void setFacturaCliente(Factura facturaCliente) {
        this.facturaCliente = facturaCliente;
    }
    
    public void agregarProducto(Producto producto){
        facturaCliente.agregarAFactura(producto);
    }

    public ArrayList<Habitat> getHabitats() {
        return habitats;
    }
    
    public void limpiarFactura(){
        facturaCliente = null;
        facturaCliente = new Factura();
    }

    public void setHabitats(ArrayList<Habitat> habitats) {
        this.habitats = habitats;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
    
    
    
}
