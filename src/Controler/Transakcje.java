package Controler;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;


public class Transakcje {
    Timestamp dataTransakcji = new Timestamp(System.currentTimeMillis());

    public void przelew() {

    }

    public String stan() {
        return String.valueOf(dataTransakcji);
    }

    public void wyplata() {

    }



}
