
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class PotenciaCubo {
     public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        double cubo = Math.pow(numero, 3);

        JOptionPane.showMessageDialog(null, "Número al cubo: " + cubo);
    }
}