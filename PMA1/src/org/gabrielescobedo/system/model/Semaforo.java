/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;


public class Semaforo {
     public static void main(String[] args) {

        String color = JOptionPane.showInputDialog(
                "Ingrese un color (verde, amarillo o rojo):");

        String accion;

        if (color.equalsIgnoreCase("verde")) {
            accion = "Avanzar";
        } else if (color.equalsIgnoreCase("amarillo")) {
            accion = "Precaución";
        } else if (color.equalsIgnoreCase("rojo")) {
            accion = "Detenerse";
        } else {
            accion = "Color no válido";
        }

        JOptionPane.showMessageDialog(null, accion);
   } 
}