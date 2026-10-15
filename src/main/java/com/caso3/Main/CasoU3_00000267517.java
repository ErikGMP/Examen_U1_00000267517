

package com.caso3.Main;

import com.caso3.controlador.ControladorInscripcion;
import com.caso3.modelo.gestorInscripcion;
import com.caso3.vista.PantallaInscripcion;

/**
 *
 * @author erika
 */
public class CasoU3_00000267517 {

    public static void main(String[] args) {
        
        gestorInscripcion modelo = new gestorInscripcion();
        
        PantallaInscripcion vista = new PantallaInscripcion(modelo);
        
        ControladorInscripcion controlador = new ControladorInscripcion(modelo);
        vista.setControlador(controlador);
        
        // 4. Mostramos la ventana
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        
    }
}
