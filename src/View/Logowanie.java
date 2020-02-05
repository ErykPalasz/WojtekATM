package View;

import Controler.Operacje;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;


public class Logowanie {
    private JPanel panelLog;  // nie widze nazwy obiektu
    private JButton zaloguj;
    private JTextField login;
    private JPasswordField haslo;


    public Logowanie() {
        zaloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        haslo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Logowanie");
        frame.setContentPane(new Logowanie().panelLog);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Operacje bankjeden = new Operacje();

        bankjeden.addNoweKontoKlienta(
                "Marek",
                "Kowalski",
                BigInteger.valueOf((long) 1234567890),
                "loginmarek",
                "haslomarek"
        );

        bankjeden.addNoweKontoKlienta(
                "Agata",
                "Kowalski",
                BigInteger.valueOf((long) 987654321),
                "agata008",
                "haslohaslo"
        );

        bankjeden.addNoweKontoKlienta(
                "Mateusz",
                "Lech",
                BigInteger.valueOf((long) 987698765),
                "matelech",
                "1234"
        );

        System.out.println("\nLista klientów banku: ");
        bankjeden.showAllKlienci();

        bankjeden.dodajNr(0,"walutowe");
        System.out.println("\nKonta bankowe \"Marka\": ");
        System.out.println(
                bankjeden.getNumerKonta(0,0) + " " +
                        bankjeden.getTypKonta(0,0) + " " +
                        bankjeden.getStanKonta(0,0) + " groszy"
        );
        System.out.println(
                bankjeden.getNumerKonta(0,1) + " " +
                        bankjeden.getTypKonta(0,1) + " " +
                        bankjeden.getStanKonta(0,1) + " groszy"
        );


    }
}
