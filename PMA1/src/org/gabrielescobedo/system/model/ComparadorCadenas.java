/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class ComparadorCadenas {
    public static void main(String[] args) {

        String palabra1 = JOptionPane.showInputDialog(
                "Ingrese la primera palabra:");

        String palabra2 = JOptionPane.showInputDialog(
                "Ingrese la segunda palabra:");

        boolean iguales = palabra1.equals(palabra2);

        JOptionPane.showMessageDialog(null,
                "¿Son exactamente iguales? " + iguales);
    }
}