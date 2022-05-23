package Ejercicio3;

/**
 *
 * @author juanf 202060257
 */
public class Producto {
    
    private double costo;
    private String id;

    public Producto(double costo, String id) {
        this.costo = costo;
        this.id = id;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
