
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class AñoBisiesto {
     public static void main(String[] args) {

        int ano = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un año:"));

        boolean bisiesto = (ano % 4 == 0 && ano % 100 != 0)
                || (ano % 400 == 0);

        JOptionPane.showMessageDialog(null,
                "¿Es bisiesto? " + bisiesto);
    }
}