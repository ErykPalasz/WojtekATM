package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operacja_konta {
    private JPanel panelOperacje;      // nie chce okienko się wyświetlić
    private JButton wplac;
    private JButton wyplac;
    private JTextField kwota;



    public Operacja_konta() {
        wplac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        wyplac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Operacja na koncie");
        frame.setContentPane(new Logowanie().panelOperacje);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
