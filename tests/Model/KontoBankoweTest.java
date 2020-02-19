package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoBankoweTest {
    private KontoBankowe konto1, konto2;

    @BeforeEach
    void setUp() {
        konto1 = new KontoBankowe(1111222233334444L);

        konto2 = new KontoBankowe();
        konto2.setBankNumber(5555666677778888L);
        konto2.updateBankBalance(20000L);

    }

    @AfterEach
    void tearDown() {
        konto1 = null;
        konto2 = null;
    }

    @Test
    void addKartaKred() {

        konto1.addKartaKred(9999);
        konto2.addKartaKred(8888);

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
    void getPin() {
        KontoBankowe konto3 = new KontoBankowe(11112222);
        assertEquals(11112222L, konto3.getBankNumber());
        assertEquals(0L, konto3.getBankBalance());

        assertEquals(0, konto3.getPin(), "pin = 0 dla konta bez karty");
    }
}