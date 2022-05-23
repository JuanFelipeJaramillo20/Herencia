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
public class Computador {
    private String referencia;
    private Ram Ram;
    private Procesador procesador;
    private DiscoDuro discoDuro;
    private TarjetaGrafica tarjetaGrafica;
    private String sistemaOperativo;
    private MotherBoard placaMadre;
    public static int contador;
    
    
    public Computador(String referencia, int capacidadTotal,int velocidad, String tecnologia,
            String marcaProcesador, String modeloProcesador, String nombreProcesador, double velocidadProcesador,
            int numNucleos, String tipoDisco, int capacidadDisco, String sistemaOperativo, String modeloPlaca, String marcaPlaca){
        
        this.referencia= referencia;
        this.Ram= new Ram(capacidadTotal, velocidad, tecnologia);
        this.procesador= new Procesador(marcaProcesador, modeloProcesador, nombreProcesador, velocidadProcesador, numNucleos);
        this.discoDuro= new DiscoDuro(tipoDisco, capacidadDisco);
        this.tarjetaGrafica= new TarjetaGrafica("", "", 0); //cero representa acá un: no tiene tarjeta gráfica.
        this.sistemaOperativo= sistemaOperativo;
        this.placaMadre= new MotherBoard(marcaPlaca, modeloPlaca);
        this.contador++;
        
    }
    public void agregarTarjetaGrafica(String fabricante, String tipoMemoriaGrafica, int tamanioMemoria){
        this.tarjetaGrafica= new TarjetaGrafica(fabricante, tipoMemoriaGrafica, tamanioMemoria);
    }
    
    public void mostrarInformacion(){
        System.out.println("----------------------------INFO----------------------------");
        System.out.println("Referencia: " + referencia);
        System.out.println("");
        System.out.println("** Ram **");
        System.out.println("- Capacidad de RAM: "+ Ram.getCapacidadTotal() + " GB");
        System.out.println("- Velocidad de memoria: " + Ram.getVelocidad() + " MHz");
        System.out.println("- Tecnología de memoria RAM: " + Ram.getTecnologia());
        System.out.println("");
        System.out.println("** Procesador **");
        System.out.println("- Marca: " + procesador.getMarcaProcesador());
        System.out.println("- modelo: " + procesador.getModeloProcesador());
        System.out.println("- Línea de procesador: " + procesador.getProcesador());
        System.out.println("- frecuencia máxima de reloj: " + procesador.getVelocidad() + " MHz");
        System.out.println("- cantidad de núcleos: " + procesador.getNumNucleos());
        System.out.println("");
        System.out.println("** Disco duro **");
        System.out.println("- disco" + discoDuro.getTipoDisco());
        System.out.println("- capacidad de memoria: " + discoDuro.getCapacidad() + " GB");
        System.out.println("");
        System.out.println("** Tarjeta Gráfica ** ");
        System.out.println("- Fabricante: " + tarjetaGrafica.getFabricante());
        System.out.println("- tipo: " + tarjetaGrafica.getTipoDeMemoria());
        System.out.println("- tamaño de memoria: " + tarjetaGrafica.getTamanioMemoria());
        System.out.println("");
        System.out.println("- Sistema operativo : " + this.sistemaOperativo);
        System.out.println("");
        System.out.println("** Placa madre **");
        System.out.println("- Marca/Fabricante: " + placaMadre.getMarca());
        System.out.println("- modelo: " + placaMadre.getModelo());
     
        
    }
    
    public static void reducirContador(){
        contador--;
    }
    
    
    
}
