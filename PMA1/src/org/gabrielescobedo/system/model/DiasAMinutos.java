
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;
 
public class DiasAMinutos {
     public static void main(String[] args) {

        int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de días:"));

        int minutos = dias * 24 * 60;

        JOptionPane.showMessageDialog(null, "Minutos totales: " + minutos);
    }
    
}