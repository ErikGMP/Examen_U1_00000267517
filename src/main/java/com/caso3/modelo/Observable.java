
package com.caso3.modelo;

/**
 *
 * @author erika
 */
public interface Observable {
    void addObserver(Observer o);
    void notifyObservers();
}
