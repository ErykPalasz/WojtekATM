package Controler;

import Model.KontoKlienta;

import java.math.BigInteger;

public class Operacje {
    //todo nowe konto klienta
    //todo usun konto klienta?
    //todo pokaż wszystkich klientów (idx, imie, nazwisko, login)
    //todo pokaż jedno konto bankowe jakiegoś klienta
    //todo pokaż wszystkie konta bankowe jakiegoś klienta
    //todo dodaj konto bankowe
    //todo usuń konto bankowe
    //todo dodaj środki do konta bankowego
    //todo odejmij środki z konta bankowego

    //lista kont klientów. można zapisać do pliku. nie wiem jak :D
    private KontoKlienta[] kontaKlientowArray = new KontoKlienta[0];

    public void addNoweKontoKlienta(String imie, String nazwisko, BigInteger pesel, String login,
                                    String haslo){
        kontaKlientowArray[kontaKlientowArray.length-1] = new KontoKlienta(imie, nazwisko, pesel, login, haslo);
    }

}
