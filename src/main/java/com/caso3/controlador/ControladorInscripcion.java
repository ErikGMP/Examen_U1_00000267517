
package com.caso3.controlador;

import com.caso3.modelo.Taller;
import com.caso3.modelo.gestorInscripcion;

/**
 *
 * @author erika
 */
public class ControladorInscripcion {
    private gestorInscripcion gesIns;

    public ControladorInscripcion(gestorInscripcion gesIns) {
        this.gesIns = gesIns;
    }
    
    public void procesarInscripcion(String IdAlumno, Taller tallerSeleccionado) {
        gesIns.inscribirAlumno(IdAlumno, tallerSeleccionado);
    }
    
    public void procesarBusquedaAlumno(String IdAlumno) {
        gesIns.buscarAlumno(IdAlumno);
    }
    
}
