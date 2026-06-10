/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class VolumenCilindro { 
     public static void main(String[] args) {

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura:"));

        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        JOptionPane.showMessageDialog(null, "Volumen: " + volumen);
    }

}