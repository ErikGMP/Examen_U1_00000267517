
package com.caso3.modelo;

/**
 *
 * @author erika
 */
public class Alumno {
    
    String idAlumno;
    String nombre;
    String carrera;

    public Alumno(String idAlumno, String nombre, String carrera) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }
    
    
    
    
}
