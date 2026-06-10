
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class ConcatenarNombre {
     public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

        String nombreCompleto = nombre + " " + apellido;

        JOptionPane.showMessageDialog(null,
                "Nombre Completo: " + nombreCompleto);
    }
}