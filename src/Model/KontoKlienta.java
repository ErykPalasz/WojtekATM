package Model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class KontoKlienta {

    private DaneOsobowe daneOsobowe;
    private Login logowanie;
    private KontoBankowe kontoBankowe;
    private KontoBankowe[] konta = new KontoBankowe[3];

    // przy dodawaniu użytkownika, od razu określam jego dane osobowe (imie, nazwisko i pesel) oraz
    // login i hasło. Przy okazji tworzy się puste debetowe konto bankowe.
    public KontoKlienta(String imie, String nazwisko, BigInteger pesel, String login, String haslo){

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        daneOsobowe = new DaneOsobowe(imie, nazwisko, pesel);
        logowanie = new Login(login, haslo);

        // numer konta to pesel + aktualny stempel czasowy w ms. Nie chce mi się wymyślać
        // faktycznego systemu dobierania numerów kont bankowych, a ten wydaje się i tak dość
        // unikalny.
        kontoBankowe = new KontoBankowe(pesel.add(BigInteger.valueOf(timestamp.getTime())), "debetowe");
        konta[0]=kontoBankowe;
    }

    //todo: add konto bankowe
    //todo: zobacz konto bankowe
    //todo: remove konto bankowe

}
