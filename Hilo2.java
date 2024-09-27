/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohilos;

/**
 *
 * @author Nirva
 */
public class Hilo2 extends Thread {
  private final RecursoHilos Ejemplohilos;
    public Hilo2(String nombre, RecursoHilos j) {
        this.setName(nombre);
        this.Ejemplohilos = j;
    }

    @Override
    public void run() {
        Ejemplohilos.decrementaCuenta();
        //invoca al método que decrementa la cuenta de accesos al jardín
    }
}
