
package com.caso3.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author erika
 */
public class gestorInscripcion implements Observable{
    
    private List<Observer> observadores = new ArrayList<>();
    private List<Taller> listaTalleres = new ArrayList<>();
    private List<Alumno> listaAlumnos = new ArrayList<>();
    private Ticket ultimoTicket;
    private Alumno alumnoActual;
    
    
    public gestorInscripcion() {
        listaTalleres.add(new Taller("Apps Webs", "Brianda", "Sabado, 14/Octubre", "Sabado 28/Octubre", "11:00 Am - 2:00 Pm", "Curso de diseño de aplicaciones web"));
        listaTalleres.add(new Taller("Ciberseguridad", "Benitez", "Sabado, 14/Octubre", "Sabado 28/Octubre", "2:00 Pm - 4:00 Pm", "Curso de ciberseguridad basica"));
        
        listaAlumnos.add(new Alumno("00000267517", "Erik Andres Guzman Meraz", "Ingenieria en Software"));
        listaAlumnos.add(new Alumno("00000268517", "Roberto Macias Cein", "Licenciatura en Educacion Fisica"));
    }
    
    @Override
    public void addObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observadores) {
            o.update();
        }
    }
    
    public List<Taller> obtenerTalleres () {
        return listaTalleres;
    }
    
    public void buscarAlumno(String IdAlumno) {
        alumnoActual = null;
        for (Alumno a: listaAlumnos) {
            if (a.getIdAlumno().equals(IdAlumno)) {
                alumnoActual = a;
                break;
            }
        }
    }
    
    public void inscribirAlumno( String IdAlumno, Taller taller ) {
        buscarAlumno(IdAlumno);
        
        if( alumnoActual != null && taller != null ) {
            ultimoTicket = new Ticket(alumnoActual, taller);
            notifyObservers();
        } else {
            System.out.println("Error: Alumno no encontrado o taller no seleccionado");
        }
    }

    public Ticket getUltimoTicket() {
        return ultimoTicket;
    }

    public Alumno getAlumnoActual() {
        return alumnoActual;
    }
    
    
    
}
