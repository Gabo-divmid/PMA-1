
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class RestaDivision {
    public static void main(String[] args) {

        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dividendo:"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese divisor:"));

        int residuo = dividendo % divisor;

        JOptionPane.showMessageDialog(null, "Residuo: " + residuo);
    }

}