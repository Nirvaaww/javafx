package reloj2;

/**
 *
 * @author Nirva
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class RelojDigital extends JFrame {
    private boolean formato24Horas;
    private boolean activarAlarma;
    private int horaAlarma;
    private int minutoAlarma;
    private String mensajeAlarma;

    private final JLabel labelHora;
    private final Timer timer;

    public RelojDigital() {
        formato24Horas = true;
        activarAlarma = false;
        horaAlarma = 0;
        minutoAlarma = 0;
        mensajeAlarma = "¡Es hora de despertar!";

        labelHora = new JLabel();
            labelHora.setFont(new Font("Arial", Font.PLAIN, 60)); 
        labelHora.setForeground(Color.PINK); // Puedes cambiar el color aquí
        labelHora.setHorizontalAlignment(JLabel.CENTER);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarHora();
                verificarAlarma();
            }
        });
        timer.start();

        setLayout(new BorderLayout());
        add(labelHora, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void actualizarHora() {
        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat formatoHora;
        if (formato24Horas) {
            formatoHora = new SimpleDateFormat("HH:mm:ss");
        } else {
            formatoHora = new SimpleDateFormat("hh:mm:ss a");
        }
        labelHora.setText(formatoHora.format(calendario.getTime()));
    }

    private void verificarAlarma() {
        if (activarAlarma) {
            Calendar calendario = Calendar.getInstance();
            int horaActual = calendario.get(Calendar.HOUR_OF_DAY);
            int minutoActual = calendario.get(Calendar.MINUTE);

            if (horaActual == horaAlarma && minutoActual == minutoAlarma) {
                 UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 18));
                UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 13));

                JOptionPane.showMessageDialog(this, mensajeAlarma, "Alarma", JOptionPane.INFORMATION_MESSAGE);
                activarAlarma = false; // Desactivar la alarma después de que suene una vez
            }
        }
    }

    public void setFormato24Horas(boolean formato24Horas) {
        this.formato24Horas = formato24Horas;
        actualizarHora();
    }

    public void setActivarAlarma(boolean activarAlarma) {
        this.activarAlarma = activarAlarma;
    }

    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public void setMinutoAlarma(int minutoAlarma) {
        this.minutoAlarma = minutoAlarma;
    }

    public void setMensajeAlarma(String mensajeAlarma) {
        this.mensajeAlarma = mensajeAlarma;
    }
}


