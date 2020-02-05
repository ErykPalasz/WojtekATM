package Controler;

import Model.KontoBankowe;
import Model.KontoKlienta;

import java.math.BigInteger;

public class Operacje {
    //todo pokaż jedno konto bankowe jakiegoś klienta
    //todo pokaż wszystkie konta bankowe jakiegoś klienta
    //todo dodaj konto bankowe
    //todo usuń konto bankowe
    //todo dodaj środki do konta bankowego
    //todo odejmij środki z konta bankowego

    //lista kont klientów. można zapisać do pliku. nie wiem jak :D
    private KontoKlienta[] kontaKlientowArray = new KontoKlienta[0];

    //nowe konto klienta
    public void addNoweKontoKlienta(String imie, String nazwisko, BigInteger pesel, String login,
                                    String haslo){
        kontaKlientowArray[kontaKlientowArray.length-1] = new KontoKlienta(imie, nazwisko, pesel, login, haslo);
    }

    //usun konto klienta?
    public void trashKontoKlienta(int idxKlienta){
        kontaKlientowArray[idxKlienta] = null;
    }

    public void showKontoKlienta(int idxKlienta){
        System.out.println(
                String.valueOf(idxKlienta) + "_" +
                kontaKlientowArray[idxKlienta].getImie() + "_" +
                kontaKlientowArray[idxKlienta].getNazwisko() + "_" +
                kontaKlientowArray[idxKlienta].getLogin()
        );
    }

    //pokaż wszystkich klientów (idx, imie, nazwisko, login)
    public void ShowAllKlienci(){
        for(int i=0; i<kontaKlientowArray.length; i++){
            showKontoKlienta(i);
        }
    }

    public BigInteger getNumerKonta(int ktoreKonto){
        return kontaKlientowArray[0].getKontoSingle(ktoreKonto).getNumerKonta();
    }
    public String getTypKonta(int ktoreKonto){
        return kontaKlientowArray[0].getKontoSingle(ktoreKonto).getTypKonta();
    }
    public BigInteger getStanKonta(int ktoreKonto){
        return kontaKlientowArray[0].getKontoSingle(ktoreKonto).getStanKonta();
    }

}
