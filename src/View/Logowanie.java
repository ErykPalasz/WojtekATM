package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Logowanie {
    private JPanel panel;  // nie widze nazwy obiektu
    private JButton operuj;
    private JTextField login;
    private JPasswordField haslo;


    public Logowanie() {
        operuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Logowanie");
        frame.setContentPane(new Logowanie().panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
