
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class ContadorLogitud {
     public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

        int longitud = palabra.length();

        JOptionPane.showMessageDialog(null,
                "La palabra tiene " + longitud + " letras.");
    }
}