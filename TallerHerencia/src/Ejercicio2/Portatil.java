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
public class Portatil extends Computador{
    private String cableDeAlimentacion;
    private String bateria;
    private boolean integraAlmohadillaDeRefrigeracion;
    public Portatil(String referencia, int capacidadTotal, int velocidad, String tecnologia, String marcaProcesador, String modeloProcesador, String nombreProcesador, double velocidadProcesador, int numNucleos, String tipoDisco, int capacidadDisco, String sistemaOperativo, String modeloPlaca, String marcaPlaca,
            String cableDeAlimentacion, String bateria, boolean integraAlmohadillaDeRefrigeracion) {
        super(referencia, capacidadTotal, velocidad, tecnologia, marcaProcesador, modeloProcesador, nombreProcesador, velocidadProcesador, numNucleos, tipoDisco, capacidadDisco, sistemaOperativo, modeloPlaca, marcaPlaca);
        this.cableDeAlimentacion= cableDeAlimentacion;
        this.bateria= bateria;
        this.integraAlmohadillaDeRefrigeracion= integraAlmohadillaDeRefrigeracion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("- cable de alimentacion: " + cableDeAlimentacion);
        System.out.println("- bateria: " + bateria);
        System.out.println(integraAlmohadillaDeRefrigeracion? "Integra almohadilla de refrigeracion": "Almohadilla de refrigeracion por separado");
    }
    
    
    
    
    
}
