package Model;

public class KartaKred {
    private long number;
    private int pin;
    KartaKred(long numer_karty, int pin){
        this.number = numer_karty;
        this.pin = pin;
    }

    @Deprecated
    KartaKred(){
        this(0,0);
    }

    void setNumber(long numer_karty){
        this.number = numer_karty;
    }

    long getNumber() {
        return number;
    }

    void setPin(int pin){
        this.pin = pin;
    }

    long getPin(){
        return pin;
    }
}
