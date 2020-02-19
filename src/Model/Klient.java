package Model;

import java.util.ArrayList;

public class Klient {
    private String imie, nazwisko, adres;
    private ArrayList<KontoBankowe> arrayPosiadaneKonta = new ArrayList<>();
    private KontoBankowe konto;

    Klient(String imie, String nazwisko, String adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    // od razu dodaje się karta kredytowa do konta. tak z automatu bo to one przechowują pin.
    // co z tego, że nie zawsze to ma sens, np w przypadku kont oszczędnościowych :)
    // ale, kto mówi, że te karty muszą być zawsze wydawane.
    void addKontobankowe(long numer_konta, int pin) {
        konto = new KontoBankowe(numer_konta, pin);
        arrayPosiadaneKonta.add(konto);
    }

    @Deprecated
    void addKontobankowe(long numer_konta) {
        konto = new KontoBankowe(numer_konta);
        arrayPosiadaneKonta.add(konto);
    }

    // na upór można dodać tą kartę później, albo wcale jej nie dodać,
    // ale konto zostanie wtedy bez hasła pin :D.
    @Deprecated
    void addKartaDoKonta(int idx, int pin) {
        arrayPosiadaneKonta.get(idx).setKartaKred(pin);
    }

    KontoBankowe getKontoBankowe(int idx) {
        return arrayPosiadaneKonta.get(idx);
    }


}
