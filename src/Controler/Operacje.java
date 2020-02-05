package Controler;

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

    private KontoKlienta showKontoKlienta(int idxKlienta){
        return kontaKlientowArray[idxKlienta];
    }

    //pokaż wszystkich klientów (idx, imie, nazwisko, login)
    public void ShowAllKlienci(){
        for(int i=0; i<kontaKlientowArray.length; i++){
            System.out.println(
                    String.valueOf(i) + "_" +
                    showKontoKlienta(i).getImie() + "_" +
                    showKontoKlienta(i).getNazwisko() + "_" +
                    showKontoKlienta(i).getLogin()
            );

        }
    }

}
