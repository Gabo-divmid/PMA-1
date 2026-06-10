
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class PromedioAcademia {
     public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3:"));

        double promedio = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
    }

}