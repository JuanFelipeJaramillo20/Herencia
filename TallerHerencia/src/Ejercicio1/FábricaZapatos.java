/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Andom 2059956-3743
 */
public class FábricaZapatos {
    private String[] listaNombreZapatos={"Botas", "Tenis", "Sandalias", "Mocasines"};
    private ArrayList<Zapato> zapatos;
    
    public FábricaZapatos(){
        zapatos= new ArrayList<Zapato>();
        GenerarZapatos();
    }
    
    public void ImprimirInfoZapatos(){
        int contador= 1;
        for (Zapato z : zapatos) {
            System.out.println("Zapato #" + contador);
            z.mostrarInformacion();
            System.out.println("");
            contador++;
        }
    }
    
    
    public void GenerarZapatos(){
        for (int i = 0; i < 10; i++) {
            
            String zapatoAConstruir= Util.seleccionarArrayStringAleatorio(listaNombreZapatos, 0, 3);
            switch(zapatoAConstruir){
                case "Botas": GenerarBotas(); break;
                case "Tenis": GenerarTenis(); break;
                case "Sandalias": GenerarSandalias(); break;
                case "Mocasines": GenerarMocasines(); break;
            }
        }
        
    }
    
    private void GenerarBotas(){
        String MATERIAL_NOMBRE= Util.generarMaterial();
        String MARCA_NOMBRE= Util.generarMarca();
        String ESTILO_NOMBRE= Util.generarEstiloDeBotas();
        
        Botas bota= new Botas(Material.valueOf(MATERIAL_NOMBRE), Util.generarAleatorioIntEntreDosNumeros(25, 40), Marcas.valueOf(MARCA_NOMBRE), Util.generarBoolean(), 
                Util.generarAleatorioIntEntreDosNumeros(70000, 200000), Util.generarColor(), Util.generarBoolean(), Util.seleccionarArrayStringAleatorio(Util.TIPO_DE_CANIO, 0, 2), EstiloBotas.valueOf(ESTILO_NOMBRE));
        zapatos.add(bota);
    }
    
    private void GenerarTenis(){
        String MATERIAL_NOMBRE= Util.generarMaterial();
        String MARCA_NOMBRE= Util.generarMarca();
        Zapatillas tenis= new Zapatillas(Material.valueOf(MATERIAL_NOMBRE),Util.generarAleatorioIntEntreDosNumeros(25, 40) , Marcas.valueOf(MARCA_NOMBRE), Util.generarBoolean(), Util.generarAleatorioIntEntreDosNumeros(100000, 300000) ,
                Util.generarColor(), Util.generarBoolean(), Util.generarBoolean(), Util.generarBoolean(), Util.seleccionarArrayStringAleatorio(Util.PARA_DEPORTE, 0, Util.PARA_DEPORTE.length-1));
        zapatos.add(tenis);
    }
    
    private void GenerarSandalias(){
        String MATERIAL_NOMBRE= Util.generarMaterial();
        String MARCA_NOMBRE= Util.generarMarca();
        Sandalias sandalias= new Sandalias(Material.valueOf(MATERIAL_NOMBRE), Util.generarAleatorioIntEntreDosNumeros(25, 40), Marcas.valueOf(MARCA_NOMBRE), Util.generarBoolean(), 
                Util.generarAleatorioIntEntreDosNumeros(20000, 100000), Util.generarColor(), Util.seleccionarArrayStringAleatorio(Util.ATADA_AL_PIE_MEDIANTE, 0, Util.ATADA_AL_PIE_MEDIANTE.length -1), Util.generarBoolean());
        zapatos.add(sandalias);
    }
    
    private void GenerarMocasines(){
        String MATERIAL_NOMBRE= Util.generarMaterial();
        String MARCA_NOMBRE= Util.generarMarca();
        String TIPO_MOCASIN= Util.generarTipoMocasin();
        Mocasines mocasines= new Mocasines(Material.valueOf(MATERIAL_NOMBRE), Util.generarAleatorioIntEntreDosNumeros(25, 40), Marcas.valueOf(MARCA_NOMBRE), Util.generarBoolean(), 
                Util.generarAleatorioIntEntreDosNumeros(70000, 120000), Util.generarColor(), TipoMocasines.valueOf(TIPO_MOCASIN), Util.seleccionarArrayStringAleatorio(Util.FORMA_PUNTA, 0, Util.FORMA_PUNTA.length-1), Util.generarBoolean());
        zapatos.add(mocasines);
    }
}
