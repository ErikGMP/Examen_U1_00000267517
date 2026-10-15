
package com.caso3.modelo;

import java.util.Random;

/**
 *
 * @author erika
 */
public class Ticket {
    
    private int numFolio;
    private Alumno alumno;
    private Taller taller;

    public Ticket(Alumno alumno, Taller taller) {
        this.numFolio = new Random().nextInt(9000) + 10000;
        this.alumno = alumno;
        this.taller = taller;
    }

    public int getNumFolio() {
        return numFolio;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Taller getTaller() {
        return taller;
    }
    
    
    
}
