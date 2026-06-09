
package org.gabrielescobedo.system.view;

import javax.swing.JOptionPane;
import org.gabrielescobedo.system.controller.ControllerMatematico;
import org.gabrielescobedo.system.controller.ControllerCadena;
import org.gabrielescobedo.system.controller.ControllerLogico;

public class MenuPrincipal {

    public void mostrarMenu() {

        String opcion;

        do {

            opcion = JOptionPane.showInputDialog(
                    "1. Operaciones Matemáticas\n"
                    + "2. Cadenas\n"
                    + "3. Lógica\n"
                    + "4. Salir");

            switch (opcion) {

                case "1":
                    new ControllerMatematico().MenuMatematico();
                    break;

                case "2":
                    new ControllerCadena().menuCadenas();
                    break;

                case "3":
                    new ControllerLogico().menuLogica();
                    break;

                case "4":
                    break;
            }

        } while (!opcion.equals("4"));
    }
}