/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.gabrielescobedo.system.model;

import javax.swing.JOptionPane;

public class ValidadordeTriangulo {
     public static void main(String[] args) {

        double lado1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese lado 1:"));

        double lado2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese lado 2:"));

        double lado3 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese lado 3:"));

        boolean esTriangulo =
                (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1);

        JOptionPane.showMessageDialog(null,
                "¿Se puede formar un triángulo? " + esTriangulo);
    }
}