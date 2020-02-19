package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KartaKredTest {
    private KartaKred karta1, karta2;

    @BeforeEach
    void setUp() {
        karta1 = new KartaKred(1234567890, 1234);
        karta2 = new KartaKred();
        karta2.setNumber(987654321);
        karta2.setPin(5678);

    }

    @AfterEach
    void tearDown() {
        karta1 = null;
        karta2 = null;
    }

    @Test
    void getNumber() {
        assertEquals(1234567890, karta1.getNumber(), "konstruktor()");
        assertEquals(987654321, karta2.getNumber(), "setter()");
    }

    @Test
    void getPin() {
        assertEquals(1234, karta1.getPin(), "konstruktor()");
        assertEquals(5678, karta2.getPin(), "setter()");
    }
}