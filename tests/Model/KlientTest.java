package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KlientTest {

    private ArrayList<Klient> arrayKlienci;
    private Klient klient;

    @BeforeEach
    void setUp() {
        arrayKlienci = new ArrayList<>();
        klient = new Klient("Adam", "Małysz", "adammalysz@email.com");
    }

    @AfterEach
    void tearDown() {
        arrayKlienci = null;
        klient = null;
    }

    @Test
    void addgetKontobankowe() {
        klient.addKontobankowe(111122223333L, 1111);
        klient.addKontobankowe(222233334444L, 2222);

        assertEquals(111122223333L,klient.getKontoBankowe(0).getBankNumber());
        assertEquals(222233334444L,klient.getKontoBankowe(1).getBankNumber());
        assertEquals(1111, klient.getKontoBankowe(0).getPin());
        assertEquals(2222, klient.getKontoBankowe(1).getPin());
    }

    @Test
    void addKartaDoKonta() {
        klient.addKontobankowe(111122223333L);
        assertEquals(0, klient.getKontoBankowe(0).getPin());
        klient.addKartaDoKonta(0, 1111);
        assertEquals(1111, klient.getKontoBankowe(0).getPin());
    }
}