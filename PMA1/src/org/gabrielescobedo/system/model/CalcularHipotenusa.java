/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class CalcularHipotenusa {
      public static void main(String[] args) {

        double catetoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Cateto A:"));
        double catetoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Cateto B:"));

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        JOptionPane.showMessageDialog(null, "Hipotenusa: " + hipotenusa);
    }
}