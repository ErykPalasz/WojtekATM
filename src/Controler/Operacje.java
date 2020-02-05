package Controler;

import Model.KontoBankowe;
import Model.KontoKlienta;

import java.math.BigInteger;
import java.util.ArrayList;

public class Operacje {
    //todo pokaż wszystkie konta bankowe jakiegoś klienta
    //todo usuń konto bankowe
    //todo dodaj środki do konta bankowego
    //todo odejmij środki z konta bankowego

    //lista kont klientów. można zapisać do pliku. nie wiem jak :D
    private ArrayList<KontoKlienta> kontaKlientowArray = new ArrayList<>();

    //nowe konto klienta
    public void addNoweKontoKlienta(String imie, String nazwisko, BigInteger pesel, String login,
                                    String haslo){
        KontoKlienta konto = new KontoKlienta(imie, nazwisko, pesel, login, haslo);

        kontaKlientowArray.add(konto);
    }

    //usun konto klienta
    public void trashKontoKlienta ( int idxKlienta ){
        kontaKlientowArray.remove(idxKlienta);
    }

    public void showKontoKlienta ( int idxKlienta){
        System.out.println(
                idxKlienta + "_" +
                    kontaKlientowArray.get(idxKlienta).getImie() + "_" +
                    kontaKlientowArray.get(idxKlienta).getNazwisko() + "_" +
                    kontaKlientowArray.get(idxKlienta).getLogin()
        );
    }
    //pokaż wszystkich klientów (idx, imie, nazwisko, login)
    public void showAllKlienci () {
        for (int i = 0; i < kontaKlientowArray.size(); i++) {
            showKontoKlienta(i);
        }
    }

    public BigInteger getNumerKonta(int klient, int ktoreKonto){
        return kontaKlientowArray.get(klient).getKontoSingle(ktoreKonto).getNumerKonta();
    }
    public String getTypKonta(int klient, int ktoreKonto){
        return kontaKlientowArray.get(klient).getKontoSingle(ktoreKonto).getTypKonta();
    }
    public BigInteger getStanKonta(int klient, int ktoreKonto){
        return kontaKlientowArray.get(klient).getKontoSingle(ktoreKonto).getStanKonta();
    }
    //dodaj konto bankowe
    public void dodajNr(int klient, String typKonta){
        kontaKlientowArray.get(klient).addKontoBankowe(typKonta);
    }

}
