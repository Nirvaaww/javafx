/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohilos;

/**
 *
 * @author Nirva
 */
public class Hilo1 extends Thread {
    private final RecursoHilos Ejemplohilos;

    public Hilo1(String nombre, RecursoHilos j) {
        this.setName(nombre);
        this.Ejemplohilos = j;
    }

    @Override
    public void run() {
        Ejemplohilos.incrementaCuenta();
        //invoca al método que incrementa la cuenta de accesos al jardín
    }
  
}
