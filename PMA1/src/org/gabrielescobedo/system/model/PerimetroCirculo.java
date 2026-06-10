
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class PerimetroCirculo {
      public static void main(String[] args) {

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio:"));

        double perimetro = 2 * Math.PI * radio;

        JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
    }
}