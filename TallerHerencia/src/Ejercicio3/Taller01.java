package Ejercicio3;

import java.util.Scanner;
import Ejercicio3.TiendaMascotas;

/**
 *
 * @author juanf 202060257
 */
public class Taller01 {

    private TiendaMascotas tm;
    private Scanner sc;
     
    public Taller01(){
        sc = new Scanner(System.in);
        tm = new TiendaMascotas();
        Menu();
        
    }
    
    public void Menu(){
        int menu = 0;
        boolean continuar = true;
        
        while(continuar){
            System.out.println("Bienvenido a la tienda de mascotas. Seleccione la opción que desee:");
            System.out.println("1. Comprar un producto.");
            System.out.println("2. Finalizar la compra y pasar a facturación.");
            System.out.println("3. Limpiar factura.");
            System.out.println("4. Salir de la aplicación.");
            menu = sc.nextInt();
            
            switch(menu){
            case 1:
                System.out.println("Elija sobre la gran gama de productos que tenemos:");
                System.out.println("1. Alimento.");
                System.out.println("2. Hábitats.");
                System.out.println("3. Mascotas.");
                int subMenu = sc.nextInt();
                switch(subMenu){
                    case 1:
                        subMenuAlimentos();
                        break;
                    case 2:
                        subMenuHabitats();
                        break;
                    case 3:
                        subMenuMascotas();
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor intente de nuevo.");
                        sc.nextInt();
                }
                break;
            case 2:
                generarFactura();
                break;
            case 3:
                tm.limpiarFactura();
                break;
            case 4:
                continuar = false;
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo por favor.");
                menu = sc.nextInt();
        }
        }
        
    }
    
    public void subMenuAlimentos(){
        boolean centinela = true;
        for (int i = 0; i < tm.getAlimentos().size(); i++) {
            System.out.println(tm.getAlimentos().get(i).toString());
            }
            System.out.println("Escriba el ID del elemento que desea comprar:");
            String idA = sc.next();
            for (int i = 0; i < tm.getAlimentos().size() && centinela; i++) {
                if(idA.equals(tm.getAlimentos().get(i).getId())){
                tm.getFacturaCliente().agregarAFactura(tm.getAlimentos().get(i));
                centinela = false;
                break;
                }            
            }
            if(centinela){
                    System.out.println("El id no se encuentra. Por favor intente de nuevo.");
                }
    }
    
    public void subMenuHabitats(){
        boolean centinela = true;
        for (int i = 0; i < tm.getHabitats().size(); i++) {
            System.out.println(tm.getHabitats().get(i).toString());
        }
        System.out.println("Escriba el ID del elemento que desea comprar:");
        String idH = sc.next();
        for (int i = 0; i < tm.getHabitats().size() && centinela ; i++) {
            if(idH.equals(tm.getHabitats().get(i).getId())){
                tm.getFacturaCliente().agregarAFactura(tm.getHabitats().get(i));
                centinela = false;
                break;
            }
        }
        if(centinela){
                System.out.println("El id no se encuentra. Por favor intente de nuevo.");
            }
   }
    
    public void subMenuMascotas(){
        boolean centinela = true;
        for (int i = 0; i < tm.getMascotas().size(); i++) {
            System.out.println(tm.getMascotas().get(i).toString());
        }
        System.out.println("Escriba el ID del elemento que desea comprar:");
        String id = sc.next();
        for (int i = 0; i < tm.getMascotas().size() && centinela ; i++) {
            if(id.equals(tm.getMascotas().get(i).getId())){
                tm.getFacturaCliente().agregarAFactura(tm.getMascotas().get(i));
                centinela = false;
                break;
            }
        }
        if(centinela){
                System.out.println("El id no se encuentra. Por favor intente de nuevo.");
            }
    }
    
    public void generarFactura(){
        System.out.println("Su factura está siendo generada. Por favor espere un momento.");
        System.out.println("Generando...");
        System.out.println("Su factura es:");
        tm.getFacturaCliente().imprimirFactura();
        System.out.println("El valor total de sus productos es: " + tm.getFacturaCliente().calcularCostoTotal());
        System.out.println("Gracias por comprar con nosotros! Vuelve pronto!");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taller01 punto3 = new Taller01();
    }
    
}
