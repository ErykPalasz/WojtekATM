import Controler.Operacje;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
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
