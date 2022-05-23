/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Andom 2059956-3743
 */
public class Main {
    public static void main(String[] args) {
        String opciones[]={"Sí", "No"};
        int seleccion= JOptionPane.showOptionDialog(null, "¿Deseas generar zapatos?", "Inicio", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if(seleccion== 0){
            FábricaZapatos f= new FábricaZapatos();
            f.ImprimirInfoZapatos();
        }
    }
}
