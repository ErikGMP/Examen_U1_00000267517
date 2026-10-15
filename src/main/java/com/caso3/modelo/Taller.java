
package com.caso3.modelo;

/**
 *
 * @author erika
 */
public class Taller {
    
    String nombre;
    String nombreInstructor;
    String fechaInicio, fechaFinal;
    String horario;
    String descripcion;

    public Taller(String nombre, String nombreInstructor, String fechaInicio, String fechaFinal, String horario, String descripcion) {
        this.nombre = nombre;
        this.nombreInstructor = nombreInstructor;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.horario = horario;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public String getHorario() {
        return horario;
    }

    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + 
                    "\nNombre del instructor: "+nombreInstructor +
                    "\nFecha de inicio: " +fechaInicio + 
                    "\nFecha de finalizacion: " +fechaFinal +
                    "\nHorario: " +horario + 
                    "\nDescripcion breve: " + descripcion +"\n";
    }
    
    
    
}
