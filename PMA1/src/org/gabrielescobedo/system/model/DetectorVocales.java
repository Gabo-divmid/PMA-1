
package org.gabrielescobedo.system.model;
import javax.swing.JOptionPane;

public class DetectorVocales {
     public static void main(String[] args) {

        char letra = JOptionPane.showInputDialog("Ingrese una letra:")
                .toLowerCase().charAt(0);

        boolean esVocal = (letra == 'a' || letra == 'e' ||
                           letra == 'i' || letra == 'o' ||
                           letra == 'u');

        JOptionPane.showMessageDialog(null,
                "¿Es vocal? " + esVocal);
    }
}