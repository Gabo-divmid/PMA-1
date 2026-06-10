
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class ConvertidorTemperatura {
    
    public static void main(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese grados Celsius:"));

        double fahrenheit = (celsius * 9 / 5) + 32;

        JOptionPane.showMessageDialog(null, "Grados Fahrenheit: " + fahrenheit);
    }

}