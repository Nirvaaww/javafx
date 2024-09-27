/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohilos;

/**
 *
 * @author Nirva
 */
public class RecursoHilos {
        private int cuenta; //para contar las entradas y salidas
    public RecursoHilos() {
        cuenta = 100; //número inicial
    }
    public synchronized void incrementaCuenta() {
        //método que increamenta en 1 la varibale cuenta
        System.out.println("hilo " + Thread.currentThread().getName()
                );
        //muestra el hilo que entra en el método
        cuenta++;
        System.out.println(cuenta + " en el programa");
        //cuenta cada acceso al jardín y muestra el número de accesos
    }
   public synchronized void  decrementaCuenta() {
        //método que decrementa en 1 la varibale cuenta
        System.out.println("hilo " + Thread.currentThread().getName()
                );
        //muestra el hilo que sale en el método
        cuenta--;
        System.out.println(cuenta + " en el programa");
        //cuenta cada acceso al jardín y muestra el número de accesos
    }
}
