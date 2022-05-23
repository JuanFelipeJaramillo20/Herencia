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
public class Util {
    //algunas constantes de tipo array string que me ayudará a generar información aleatoria
    //para algunos de los distintos zapatos
    public static String[] TIPO_DE_CANIO={"corto", "alto", "medio"};
    public static String[] FORMA_PUNTA={"puntiagudos", "redonda", "ovalado"};
    public static String[] PARA_DEPORTE={"Running", "Montaña", "Trail running", "Swimrun", "Para caminar", "De escalada"};
    public static String[] ATADA_AL_PIE_MEDIANTE= {"Cuerdas", "Cintas", "Bandas de material ligero"};
    public static String seleccionarArrayStringAleatorio(String[] listaZapatos, int min, int max){
        return listaZapatos[generarAleatorioIntEntreDosNumeros(min, max)];
    }
    
    public static int generarAleatorioIntEntreDosNumeros(int minimo, int maximo){
        return (int) (Math.random() * ((maximo+1)- minimo)) + minimo;
    }
    
    public static boolean generarBoolean(){
        return generarAleatorioIntEntreDosNumeros(0, 1)== 1? true: false; 
    }
    
    public static String generarMaterial(){
       String[] materialesZapato= {"Cuero", "Tela", "Caucho", "Plastico", "Trenzados"};
       return seleccionarArrayStringAleatorio(materialesZapato, 0, materialesZapato.length-1);
    }
    
    public static String generarMarca(){
        String[] nombresMarcas={"Reebok", "Lacoste", "Puma", "Adidas"};
        return seleccionarArrayStringAleatorio(nombresMarcas, 0, nombresMarcas.length-1);
    }
    
    public static String generarColor(){
        String[] colores={"Negro", "Azul", "Beige", "Café", "Blanco", "Gris", "Rojo", "Amarrillo"};
        return seleccionarArrayStringAleatorio(colores, 0, colores.length-1);
    }
    
    public static String generarEstiloDeBotas(){
        String[] estiloBotasNombres={"Botas_con_cremallera", "mosquetera", "Botas_con_calado", "Botas_burdeo",
           "Botas_de_serraje", "Botas_con_hebilla", "Botas_con_punta_redonda", "Botas_Chelsea", "Botas_de_senderismo"};
        return seleccionarArrayStringAleatorio(estiloBotasNombres, 0, estiloBotasNombres.length-1);
    }
    
    public static String generarTipoMocasin(){
        String[] tipoMocasin={"Mocasines_Horsebit", "Mocasines_de_borla", "Mocasín_clásico",
                               "Mocasines_Snaffle", "Mocasines_modernos"};
        return seleccionarArrayStringAleatorio(tipoMocasin, 0, tipoMocasin.length-1);
    }
}
