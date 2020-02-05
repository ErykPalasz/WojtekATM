package Model;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;

public class KontoKlienta{

    private DaneOsobowe daneOsobowe;
    private Login logowanie;
    private KontoBankowe kontoBankowe;
    private ArrayList<KontoBankowe> konta = new ArrayList<>();
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
        konta.add(kontoBankowe);
    }

    //add konto bankowe do posiadanych kont klienta
    public void addKontoBankowe(String typKonta){
        timestamp = new Timestamp(System.currentTimeMillis());
        BigInteger pesel = daneOsobowe.getPesel();
        kontoBankowe = new KontoBankowe(pesel.add(BigInteger.valueOf(timestamp.getTime())), typKonta);
        konta.add(kontoBankowe); // na ostatniej pozycji dodaj to nowe konto
    }

    //GET jedno posiadane konto bankowe przez klienta
    public KontoBankowe getKontoSingle(int idxKonta){
        return konta.get(idxKonta);
    }

    //GET wszystkie posiadane konta bankowe przez klienta
    public ArrayList getKontaArray(){
        return konta;
    }

    //wywal przez okno jakieś jedno konto bankowe klienta
    public void trashKontoSingle(int idxKonta){
        konta.remove(idxKonta);
    }

    public String getImie(){ return daneOsobowe.getImie(); }
    public String getNazwisko(){ return daneOsobowe.getNazwisko(); }
    public BigInteger getPesel(){ return daneOsobowe.getPesel(); }
    public String getLogin(){ return logowanie.getLogin(); }
    public String getPassword(){ return logowanie.getPassword(); }

}
