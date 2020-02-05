package Model;

import java.math.BigInteger;

public class DaneOsobowe extends Dane {


    private String imie;
    private String nazwisko;
    private BigInteger pesel;

    public DaneOsobowe(String imie, String nazwisko, BigInteger pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() { return imie; }
    public void setImie(String imie) { this.imie = imie; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public BigInteger getPesel() { return pesel; }
    public void setPesel(BigInteger pesel) { this.pesel = pesel; }
}
