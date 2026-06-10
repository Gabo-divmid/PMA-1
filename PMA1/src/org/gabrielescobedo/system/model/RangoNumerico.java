/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class RangoNumerico {
    public static void main(String[] args) {

        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el número:"));

        int min = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el límite mínimo:"));

        int max = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el límite máximo:"));

        boolean dentroRango = numero >= min && numero <= max;

        JOptionPane.showMessageDialog(null,
                "¿Está dentro del rango? " + dentroRango);
    }
}