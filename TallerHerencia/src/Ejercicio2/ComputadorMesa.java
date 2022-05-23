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
public class ComputadorMesa extends Computador{
    private String chasis;
    private String teclado;
    private String mouse;
    private String monitor;
    
    public ComputadorMesa(String referencia, int capacidadTotal, int velocidad, String tecnologia, 
            String marcaProcesador, String modeloProcesador, String nombreProcesador, double velocidadProcesador,
            int numNucleos, String tipoDisco, int capacidadDisco, String sistemaOperativo, String modeloPlaca, String marcaPlaca, String chasis, String teclado, String mouse, String monitor) {
        
        super(referencia, capacidadTotal, velocidad, tecnologia, marcaProcesador, modeloProcesador, nombreProcesador, velocidadProcesador, numNucleos, tipoDisco, capacidadDisco,sistemaOperativo, modeloPlaca, marcaPlaca);
        this.chasis= chasis;
        this.teclado= teclado;
        this.mouse= mouse;
        this.monitor= monitor;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("- Gabinete " + chasis);
        System.out.println("- Teclado: " + teclado);
        System.out.println("- Mouse: " + mouse);
        System.out.println("- Monitor: " + monitor);
    }
    
    
    
}
