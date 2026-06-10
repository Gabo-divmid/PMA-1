
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

    public class AreaTriangulo {
     public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura:"));

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "Área del triángulo: " + area);
    }
}
