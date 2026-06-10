/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class MayorDos {
     public static void main(String[] args) {

        double num1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el primer número:"));

        double num2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el segundo número:"));

        double mayor;

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        JOptionPane.showMessageDialog(null,
                "El mayor es: " + mayor);
    } 
 }