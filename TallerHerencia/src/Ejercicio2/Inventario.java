/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Valentina 202060174
 */
public class Inventario {
    private ArrayList<Computador> computadores;
    
    public Inventario(){
        computadores= new ArrayList<Computador>();
        enStock();
    }
    public void enStock(){
        for (int i = 0; i < 20; i++) {
            Computador computador1= new ComputadorMesa("ATF-15", 16, 2000, "DDR3", "Intel", "Core i7", "Intel Core 4th Gen. i7-4790", 3.66, 4, "SSD", 960, "Windows 10 Pro 64-Bit original.", "Micro-ATX B85", "ASUS", "Chasis Caja Atx Iceberg Glacius", "Redragon Kumara K552", "Mouse de juego Redragon Centrophorus2 M601-RGB", "Monitor samsung");
            computador1.agregarTarjetaGrafica("MSI", "‎NVIDIA GeForce GT 1030", 2);
            computadores.add(computador1);
        }
        
        for(int i= 0; i < 30; i++){
             Computador computador2= new Portatil("ATG-25", 16, 2600 , "DDR4 SDRAM", "AMD", "Ryzen 5 5500U", "AMD 6-Core Ryzen 5 5500U ", 2.1, 6, "SSD", 512,"Windows 10 Home S", "Gigabyte B450 M Ds3h", "Gigabyte","Cable eléctrico" , "batería de iones de litio de 3 celdas de 41 WHr", true);
             computadores.add(computador2);
        }  
    }
    
    public void computadoresEnVenta(){
        int contador=1;
        for(Computador c: computadores){
            System.out.println("Computador #" + contador);
            c.mostrarInformacion();
            contador++;
        }
    }
    
    public void descontinuarComputador(int pos){
        if(pos < computadores.size()){
          computadores.remove(pos);
          Computador.reducirContador();  
        }else{
            System.out.println("Usted está intentando descontinuar un computador que no existe");
        }
        
    }
    
    public void menu(){
        Scanner sc= new Scanner(System.in);
        boolean salir= true;
        do {
            System.out.println("-- Bienvenido a compuTech --");
            System.out.println("Para esta temporada contamos con un total de: " + Computador.contador + " computadores ya ensamblados");
            System.out.println("¿Qué desea? ");
            System.out.println("1. Descartar algún computador/descontinuarlo");
            System.out.println("2. Mostrar info de computadores disponibles. ");
            System.out.println("3. Salir");
            System.out.print("Qué elegis? ");
            
            int opc= sc.nextInt();
            
            switch(opc){
                case 1: 
                    System.out.print("¿Qué computador desea descontinuar?  ");
                    int posEliminar= sc.nextInt();
                    descontinuarComputador(posEliminar);
                    break;
                case 2: computadoresEnVenta(); break;
                case 3: salir= false; break;
                default: System.out.println("No es una opción de entrada");
            }
        } while (salir);
        
    }
    
    public static void main(String[] args) {
        Inventario inv= new Inventario();
        inv.menu();
    }
}
