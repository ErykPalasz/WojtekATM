package Model;

import Model.KartaKred;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KartaKredTest {
    KartaKred karta = new KartaKred(1234567890, 1234);

    @Test
    void getNumber() {
        assertEquals(1234567890, karta.getNumber());
    }

    @Test
    void getPin() {
        assertEquals(1234, karta.getPin());
    }

    @Test
    void setNumber() {
        karta.setNumber(987654321);
        assertEquals(987654321, karta.getNumber());
    }

    @Test
    void setPin() {
        karta.setPin(5678);
        assertEquals(5678, karta.getPin());
    }
}