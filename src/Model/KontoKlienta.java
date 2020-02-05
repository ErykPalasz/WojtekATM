package Model;

import java.math.BigInteger;
import java.sql.Timestamp;

public class KontoKlienta {

    private DaneOsobowe daneOsobowe;
    private Login logowanie;
    private KontoBankowe kontoBankowe;
    private KontoBankowe[] konta = new KontoBankowe[1];
    private Timestamp timestamp;

    // przy dodawaniu użytkownika, od razu określam jego dane osobowe (imie, nazwisko i pesel) oraz
    // login i hasło. Przy okazji tworzy się puste debetowe konto bankowe.
    public KontoKlienta(String imie, String nazwisko, BigInteger pesel, String login, String haslo){

        timestamp = new Timestamp(System.currentTimeMillis());
        daneOsobowe = new DaneOsobowe(imie, nazwisko, pesel);
        logowanie = new Login(login, haslo);

        // numer konta to pesel + aktualny stempel czasowy w ms. Nie chce mi się wymyślać
        // faktycznego systemu dobierania numerów kont bankowych, a ten wydaje się i tak dość
        // unikalny.
        kontoBankowe = new KontoBankowe(pesel.add(BigInteger.valueOf(timestamp.getTime())), "debetowe");
        konta[0]=kontoBankowe;
    }

    //add konto bankowe do kont klienta
    public void addKontoBankowe(String typKonta){
        timestamp = new Timestamp(System.currentTimeMillis());
        BigInteger pesel = daneOsobowe.getPesel();
        kontoBankowe = new KontoBankowe(pesel.add(BigInteger.valueOf(timestamp.getTime())), typKonta);
        konta[konta.length - 1] = kontoBankowe; // na ostatniej pozycji dodaj to nowe konto
    }

    //zobacz kontO bankowe klienta
    public KontoBankowe getKontoSingle(int idxKonta){
        return konta[idxKonta];
    }

    //zobacz kontA bankowe klienta
    public KontoBankowe[] getKontaArray(){
        return konta;
    }

    //wywal przez okno jakieś kontO bankowe klienta
    public void trashKontoSingle(int idxKonta){
        konta[idxKonta] = null;
    }

}
