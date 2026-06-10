/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class InversorTexto {
     public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        JOptionPane.showMessageDialog(null,
                "Texto invertido: " + invertida);
    }

}