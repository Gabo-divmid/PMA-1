/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class GeneradorEmail {
     public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese apellido:");
        String dominio = JOptionPane.showInputDialog("Ingrese dominio:");

        String email = nombre.toLowerCase() + "."
                + apellido.toLowerCase() + "@"
                + dominio.toLowerCase();

        JOptionPane.showMessageDialog(null,
                "Correo generado:\n" + email);
    }
}