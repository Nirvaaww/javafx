
package reloj2;

import javax.swing.SwingUtilities;

/**
 *
 * @author Nirva
 */
public class FormularioPrueba {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RelojDigital reloj = new RelojDigital();
                /*activar alarma*/
                reloj.setActivarAlarma(true);
                reloj.setHoraAlarma(21);
                reloj.setMinutoAlarma(48);
                reloj.setMensajeAlarma("¡valentino el otro!");

               
                reloj.setFormato24Horas(false);
            }
        });
    }
}


