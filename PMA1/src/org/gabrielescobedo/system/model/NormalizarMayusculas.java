/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class NormalizarMayusculas {
     public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Ingrese un texto:");

        JOptionPane.showMessageDialog(null,
                "Texto en MAYÚSCULAS:\n" + texto.toUpperCase());
    }
}