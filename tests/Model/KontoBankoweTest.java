package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoBankoweTest {
    private KontoBankowe konto0, konto1, konto2;

    @BeforeEach
    void setUp() {
        konto0 = new KontoBankowe(123123123, 1234);
        konto1 = new KontoBankowe(1111222233334444L);

        konto2 = new KontoBankowe();
        konto2.setBankNumber(5555666677778888L);
        konto2.setBankBalance(200L*100L);

    }

    @AfterEach
    void tearDown() {
        konto0 = null;
        konto1 = null;
        konto2 = null;
    }

    @Test
    void addKartaKred() {

        konto1.setKartaKred(9999);
        konto2.setKartaKred(8888);

        assertEquals(1234, konto0.getPin());
        assertEquals(9999,konto1.getPin());
        assertEquals(8888,konto2.getPin());
    }

    @Test
    void getBankNumber() {
        assertEquals(1111222233334444L, konto1.getBankNumber());
        assertEquals(5555666677778888L, konto2.getBankNumber());
    }

    @Test
    void getBankBalance() {
        assertEquals(0L, konto1.getBankBalance());
        assertEquals(20000L, konto2.getBankBalance());
    }

    @Test
    void updateBankBalance() {
        konto1.setBankBalance(100L*100L);
        assertEquals(10000L, konto1.getBankBalance());

        konto2.setBankBalance(konto2.getBankBalance()+5000L);
        assertEquals(25000L, konto2.getBankBalance());
    }

    @Test
    void getPin() {
        KontoBankowe konto3 = new KontoBankowe(11);

        assertEquals(0, konto3.getPin(), "pin powinnien = 0 dla konta bez karty");
        konto3.setKartaKred(1);
        assertEquals(1, konto3.getPin());
    }
}