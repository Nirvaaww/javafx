/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplohilos;

/**
 *
 * @author Nirva
 */
public class Ejemplohilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RecursoHilos Hilos = new RecursoHilos();
        //crea un objeto RecursoJardín

        for (int i = 1; i <= 4; i++) {
            (new Hilo1("Entra " + i, Hilos)).start();
        }//entrada de 10 hilos al jardín

        for (int i = 1; i <= 5; i++) {
            (new Hilo2("Sale " + i, Hilos)).start();
        }//salida de 15 hilos al jardín
    }
}
