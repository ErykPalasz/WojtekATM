package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KontoBankoweTest {
    private KontoBankowe konto1, konto2;

    @BeforeEach
    void setUp() {
        konto1 = new KontoBankowe(1111222233334444L,1111);
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

    }

    @Test
    void getBankNumber() {
    }

    @Test
    void getBankBalance() {
    }

    @Test
    void getPin() {
    }
}