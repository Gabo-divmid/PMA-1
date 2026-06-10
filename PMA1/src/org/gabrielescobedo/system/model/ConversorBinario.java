
package org.gabrielescobedo.system.model;

import javax.swing.JOptionPane;

public class ConversorBinario {
     public static void main(String[] args) {

        String binario = JOptionPane.showInputDialog("Ingrese una cadena de 0 y 1:");

        String resultado;

        if (binario.length() % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        JOptionPane.showMessageDialog(null,
                "La longitud es: " + resultado);
    }
    
}