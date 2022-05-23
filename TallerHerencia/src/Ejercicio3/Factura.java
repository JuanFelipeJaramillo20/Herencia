package Ejercicio3;

import java.util.ArrayList;
import Ejercicio3.Producto;

/**
 *
 * @author juanf 202060257
 */
public class Factura {
 
    private double costoTotal;
    private ArrayList<Producto> listaProductos;

    public Factura() {
        listaProductos = new ArrayList<>();
        costoTotal = 0.0;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public void agregarAFactura(Producto producto){
        listaProductos.add(producto);
    }
    
    public void imprimirFactura(){
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).toString());
        }
    }
    
    public double calcularCostoTotal(){
        for( int i = 0 ; i < listaProductos.size() ; i++ ){
            costoTotal += listaProductos.get(i).getCosto();
        }               
        return costoTotal;
    }
}
